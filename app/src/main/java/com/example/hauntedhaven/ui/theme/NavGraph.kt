package com.example.hauntedhaven.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.hauntedhaven.Screen
import detailedListings.DetailedLayout
import detailedListings.DetailedLayoutChangi
import detailedListings.DetailedLayoutChillinghamCastle
import detailedListings.DetailedLayoutGables
import detailedListings.DetailedLayoutLeapCastle
import detailedListings.DetailedLayoutStAlbansHospital
import detailedListings.DetailedLayoutStanleyHotel
import detailedListings.DetailedLayoutTowerOfLondon

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ){
        composable(route = Screen.HomeScreen.route){
            HomeScreen(navController=navController)
        }
        composable(route = Screen.ListingsPage.route){
            ListingsPage(navController = navController)


        }
        composable(route = Screen.DetailedScreen.route){
            DetailedLayout(navController = navController)
        }
        composable(route = Screen.DetailedScreenLeap.route){
            DetailedLayoutLeapCastle(navController = navController)
        }
        composable(route = Screen.DetailedScreenGables.route){
            DetailedLayoutGables(navController = navController)

        }
        composable(route=Screen.DetailedScreenChangi.route){
            DetailedLayoutChangi(navController = navController)

        }
        composable(route =Screen.DetailedScreenTowerOfLondon.route){
            DetailedLayoutTowerOfLondon(navController = navController)
        }
        
        composable(route=Screen.DetailedScreenStanleyHotel.route){
            DetailedLayoutStanleyHotel(navController = navController)
        }
        composable(route=Screen.DetailedScreenAlbansHospital.route){
            DetailedLayoutStAlbansHospital(navController = navController)
        }
        composable(route=Screen.DetailedScreenChillingham.route){
            DetailedLayoutChillinghamCastle(navController = navController)
        }
        


    }

    
}

@Composable
fun SetupNavGraph2(
    navController: NavHostController
) {
    NavHost(
        navController =navController ,
        startDestination = Screen.ListingsPage.route){
        composable(route = Screen.ListingsPage.route){
            ListingsPage(navController=navController)
        }
        composable(route = Screen.DetailedScreen.route){
            DetailedLayout(navController = navController)
        }
    }
    
}

