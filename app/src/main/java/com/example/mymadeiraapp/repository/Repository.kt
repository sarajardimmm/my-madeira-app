package com.example.mymadeiraapp.repository

import javax.inject.Inject
import javax.inject.Singleton

@Singleton//lives as long as the app
class Repository@Inject constructor(
    private val locationDao: LocationDao
) {

}