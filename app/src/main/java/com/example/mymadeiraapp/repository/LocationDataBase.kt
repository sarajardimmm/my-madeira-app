package com.example.mymadeiraapp.repository

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mymadeiraapp.model.LocationDetailData

@Database(entities = [LocationDetailData::class], version = 1)
abstract class LocationDataBase : RoomDatabase() {
    abstract fun locationDao(): LocationDao
}