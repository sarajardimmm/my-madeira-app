package com.example.mymadeiraapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.mymadeiraapp.fragments.MapScreen
import com.example.mymadeiraapp.navigation.AppNavHost
import com.example.mymadeiraapp.navigation.AppNavigation
import com.example.mymadeiraapp.ui.theme.MyMadeiraAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            val navController = rememberNavController() // Initialize NavController
            var startScreen = AppNavigation.NavigationItem.Map_Screen.route
            AppNavHost(
                navController = navController,
                startScreen = startScreen
            )
        }
    }
}