package com.example.mymadeiraapp.navigation

class AppNavigation {
    enum class Screen {
        //SPLASH,
        //MAIN_MENU,
        MAP_SCREEN,
    }
    sealed class NavigationItem(val route: String) {
        object Map_Screen : NavigationItem(Screen.MAP_SCREEN.name)
    }
}
