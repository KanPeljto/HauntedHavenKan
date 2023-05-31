package com.example.hauntedhaven.ui.theme

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.hauntedhaven.R
import com.example.hauntedhaven.Screen





@Composable
fun ListingsPage(modifier: Modifier = Modifier, navController: NavController){
    val hauntedHaven = painterResource(id =R.drawable.screenshot_2023_05_28_at_20_30_06)
    val listings = listOf(
        Listing("Eastern State Penitentiary", "Pennsylvania, USA", image = R.drawable.eastern_state_penitentiary__philadelphia__pennsylvania_lccn2011632222_tif, listingCategory.PENITENTIARY_PHANTOMS,routee="detailed_screen"),
        Listing("Leap Castle","Ireland", image = R.drawable.leap_website,listingCategory.CASTLES_MANSIONS,routee="leap_castle"),
        Listing("House of the seven gables","Massachusetts", image = R.drawable.llhouseof7gables_jpg,listingCategory.HOUSES,"house_of_gables"),
        Listing("The old Changi hospital","Singapore,Singapore", image = R.drawable.hauntedchangi_main,listingCategory.SCHOOLS_HOSPITALS,"changi"),
        Listing("The old tower of London","London, United Kingdom",image=R.drawable.keep_white_tower_jpg,listingCategory.CASTLES_MANSIONS,"tower_of_london")
        )

    LazyColumn(modifier = Modifier.padding(horizontal = 17.dp)){
        items(listings) {
                listing -> ListingItem(listing, navController = navController)


        }

    }


}

@Composable
fun ListingItem(listing: Listing, modifier: Modifier = Modifier,navController: NavController) {
    val painter = painterResource(id = listing.image)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {

        Row(
            modifier = Modifier
                .padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painter, contentDescription = null,
                modifier = Modifier
                    .size(96.dp)
                    .clickable { navController.navigate(listing.routee) },
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier.padding(top = 20.dp)
            ) {
                Row {
                    Column(modifier = Modifier.fillMaxSize()) {
                        Text(
                            text = listing.title,
                            style = MaterialTheme.typography.titleMedium,
                            modifier = Modifier.padding(16.dp, bottom = 30.dp),
                            color = Color.White
                        )
                        Text(
                            text = listing.location,
                            style = MaterialTheme.typography.bodySmall,
                            modifier = Modifier.padding(16.dp),
                            color = Color.White
                        )
                    }
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