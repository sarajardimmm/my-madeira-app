package com.example.mymadeiraapp.locationDetail

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mymadeiraapp.R
import com.example.mymadeiraapp.model.LocationDetailData
import com.google.android.gms.maps.model.LatLng

@Composable
fun LocationDetailCompose(isVisible: Boolean, locationDetailData: LocationDetailData, onClick: () -> Unit) {

    if (isVisible) {
        Card(modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)
            .padding(4.dp)
            .clickable { onClick()},
            shape = RoundedCornerShape(32.dp)
            ) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Row(modifier = Modifier.
                    fillMaxWidth()
                    ){
                        Text("Location Details", style = MaterialTheme.typography.titleMedium)
                        Icon(
                            modifier = Modifier.padding(dimensionResource(id = R.dimen.medium_padding)).fillMaxSize(),
                            imageVector = ImageVector.vectorResource(R.drawable.ic_launcher_foreground),
                            contentDescription = "label",
                            tint = colorResource(R.color.purple_200),
                        )
                    }
                    Text("Name: ${locationDetailData.name}")
                    Text(locationDetailData.detailMessage)
                    // Add more details if you want

                    Spacer(Modifier.height(8.dp))
                    Button(onClick = {  }) {
                        Text("More")
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        //.align(Alignment.CenterHorizontally),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Button(
                            modifier = Modifier,
                            onClick = {},
                            enabled = true,
                            //contentPadding = PaddingValues(),
                        ){

                        }

                        Button(
                            modifier = Modifier,
                            onClick = {},
                            enabled = true,
                            //contentPadding = PaddingValues(),
                        ){

                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun DetailPreview(){

    val mockLocationDetailData = LocationDetailData(0,
        LatLng(32.738999, -16.681050),
        "Name",
        "Details where I say why this is a really cool spot and why you should visit, also I would " +
                "mention some warnings of times of year to avoid it because there are too many people")

    LocationDetailCompose(true, mockLocationDetailData) {}
}