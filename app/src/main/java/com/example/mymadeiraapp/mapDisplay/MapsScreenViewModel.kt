package com.example.mymadeiraapp.mapDisplay

import androidx.lifecycle.ViewModel
import androidx.navigation.NavHostController
import com.google.android.gms.maps.model.LatLng
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MapsScreenViewModel @Inject constructor() :
    ViewModel() {

    var positionList = mutableListOf<LatLng>()

    fun setAllPoints(){
        //todo get points from repository
        //todo sets all points in positionList that trigers recomposition on the screen
        //can I set pased on the position and zoom of the screen?
        //or with maps I need to just set them all
    }
}