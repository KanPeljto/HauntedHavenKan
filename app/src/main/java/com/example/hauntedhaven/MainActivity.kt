package com.example.hauntedhaven

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.hauntedhaven.ui.theme.HauntedHavenTheme
import com.example.hauntedhaven.ui.theme.HomeScreen
import com.example.hauntedhaven.ui.theme.ListingScreen
import com.example.hauntedhaven.ui.theme.SetupNavGraph

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            HauntedHavenTheme {
                navController= rememberNavController()
                SetupNavGraph(navController = navController)

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HauntedHavenTheme {
        HomeScreen(navController = rememberNavController())

    }
}

