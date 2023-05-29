package com.example.hauntedhaven

sealed class Screen(val route: String){
    object HomeScreen: Screen("home_screen")
    object ListingsPage: Screen("listing_screen")

    object DetailedScreen:Screen("detailed_screen")
}
