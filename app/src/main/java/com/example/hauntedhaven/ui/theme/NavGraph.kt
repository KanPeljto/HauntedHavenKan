package com.example.hauntedhaven.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.hauntedhaven.Screen

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

