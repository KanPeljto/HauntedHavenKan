package com.example.hauntedhaven.filteredScreens

import com.example.hauntedhaven.ui.theme.BloodRed
import com.example.hauntedhaven.ui.theme.GhostWhite
import com.example.hauntedhaven.ui.theme.HauntedHavenTheme
import com.example.hauntedhaven.ui.theme.HorizontalScroll
import com.example.hauntedhaven.ui.theme.Listing
import com.example.hauntedhaven.ui.theme.ListingItem
import com.example.hauntedhaven.ui.theme.MistyGrey
import com.example.hauntedhaven.ui.theme.MoonlitViolet
import com.example.hauntedhaven.ui.theme.PhantomBlack
import com.example.hauntedhaven.ui.theme.TopBar
import com.example.hauntedhaven.ui.theme.halloweenOrange
import com.example.hauntedhaven.ui.theme.listingCategory

import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.hauntedhaven.R
import com.example.hauntedhaven.Screen
import com.example.hauntedhaven.ui.theme.ListingsPage


@Composable
fun ListingsPagePenitentiary(modifier: Modifier = Modifier, navController: NavController){
    val hauntedHaven = painterResource(id =R.drawable.screenshot_2023_05_28_at_20_30_06)
    val listings = listOf(
        Listing("Eastern State Penitentiary", "Pennsylvania, USA", image = R.drawable.eastern_state_penitentiary__philadelphia__pennsylvania_lccn2011632222_tif, listingCategory.PENITENTIARY_PHANTOMS,routee="detailed_screen"),
    )

    Box(
        modifier = Modifier.background(PhantomBlack).fillMaxSize()
    ) {
        Column(

        ) {
            TopBar(title = "Listings", navController = navController)
            HorizontalScroll(navController = navController)
            LazyColumn(modifier = Modifier.padding(horizontal = 17.dp)) {
                items(listings) { listing ->
                    ListingItem(listing, navController = navController)


                }

            }
        }

    }
}








@Preview(showBackground = true)
@Composable
fun ListingPreview() {
    HauntedHavenTheme {
        ListingsPage(navController = rememberNavController())

    }
}