package com.example.mymadeiraapp.mapDisplay

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.mymadeiraapp.locationDetail.LocationDetailCompose
import com.example.mymadeiraapp.model.LocationDetailData
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.rememberCameraPositionState
import com.google.maps.android.compose.rememberMarkerState

@Composable
fun MapScreen(navController: NavController, mapsScreenViewModel: MapsScreenViewModel) {
    MapScreenContent()
}

@Composable
fun MapScreenContent(){
    // Coordinates for Atasehir
    val myPoint = LatLng(32.738999, -16.681050)
    val myPoint2 = LatLng(32.748999, -16.691050)
    //TODO get points from viewmodel
    val markerState = rememberMarkerState(position = myPoint)
    val markerState2 = rememberMarkerState(position = myPoint2)
    // Camera position state
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(myPoint, 15f)
    }

    // Google Map composable
    GoogleMap(
        modifier = Modifier.fillMaxSize(),
        cameraPositionState = cameraPositionState
    ){
        Marker(
            state = markerState,
            title = "title1",
            snippet = "Marker snippet 1",
            onInfoWindowClick = {},
            onClick =  { it->
                Log.d("Sara", "Marker Clicked")
                false
            },
            //add custom icons for markers here
            icon = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)
        )
        Marker(
            state = markerState2,
            title = "title2",
            snippet = "Marker snippet 2",
            onInfoWindowClick = {},
            onClick =  { it->
                Log.d("Sara", "Marker Clicked")
                false
            },
            //add custom icons for markers here
            icon = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)
        )

    }
}

@Preview
@Composable
fun MapScreenPreview() {
    val mockLocationDetailData = LocationDetailData(0,
        LatLng(32.738999, -16.681050),
        "Name",
        "Details where I say why this is a really cool spot and why you should visit, also I would " +
                "mention some warnings of times of year to avoid it because there are too many people")
    LocationDetailCompose(true, mockLocationDetailData, {})
    MapScreenContent()
}