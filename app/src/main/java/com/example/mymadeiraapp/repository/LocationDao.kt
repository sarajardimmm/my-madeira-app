package com.example.mymadeiraapp.repository

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface LocationDao {
    //@Query("SELECT * FROM Location WHERE id = :userId")
    //suspend fun getLocationById(userId: String): Location?

    //@Insert(onConflict = OnConflictStrategy.REPLACE)
    //suspend fun insertUser(user: Location)

    //@Delete
    //suspend fun deleteUser(user: Location)

    //TODO do more
    //TODO get all the locations
    //TODO getByLocation or range of location
}