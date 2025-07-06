package com.example.mymadeiraapp.model

import com.google.android.gms.maps.model.LatLng

data class LocationDetailData(
    val position: LatLng,
    val name: String,
    //maybe an image
    val detailMessage: String
)