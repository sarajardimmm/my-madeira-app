package com.example.mymadeiraapp.mapDisplay

import androidx.lifecycle.ViewModel
import com.google.android.gms.maps.model.LatLng
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MapsScreenViewModel @Inject constructor() :
    ViewModel() {

    val _errorMessage = MutableStateFlow<Int>(0)
    val errorMessage = _errorMessage.asStateFlow()

    var positionList = mutableListOf<LatLng>()

    fun setAllPoints(){
        //todo get points from repository
        //todo sets all points in positionList that trigers recomposition on the screen
        //can I set pased on the position and zoom of the screen?
        //or with maps I need to just set them all
    }
}