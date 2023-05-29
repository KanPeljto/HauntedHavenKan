package com.example.hauntedhaven

sealed class Screen(val route: String){
    object HomeScreen: Screen("home_screen")
    object ListingScreen: Screen("listing_screen")
}
