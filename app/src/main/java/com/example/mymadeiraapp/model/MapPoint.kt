package com.example.mymadeiraapp.model

import com.google.android.gms.maps.model.LatLng

data class MapPoint(
    var position : LatLng,
    var id : Int,
    var details : String //this should be a data class
)
