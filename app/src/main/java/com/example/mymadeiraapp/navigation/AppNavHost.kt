package com.example.mymadeiraapp.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mymadeiraapp.fragments.MapScreen
import com.example.mymadeiraapp.fragments.MapsScreenViewModel


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startScreen: String
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startScreen
    ) {
        composable(AppNavigation.NavigationItem.Map_Screen.route) {
            Log.d("Na", "AppNavHost navigating to SplashScreen ")
            val mapsScreenViewModel = MapsScreenViewModel(navController)
            MapScreen(navController, mapsScreenViewModel)
        }
    }
}