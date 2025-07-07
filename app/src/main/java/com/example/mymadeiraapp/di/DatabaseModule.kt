package com.example.mymadeiraapp.di

import android.content.Context
import androidx.room.Room
import com.example.mymadeiraapp.repository.LocationDao
import com.example.mymadeiraapp.repository.LocationDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext appContext: Context
    ): LocationDataBase {
        return Room.databaseBuilder(
            appContext,
            LocationDataBase::class.java,
            "mydatabase.db"
        ).build()
    }

    @Provides
    fun provideUserDao(database: LocationDataBase): LocationDao {
        return database.locationDao()
    }
}