package com.example.hauntedhaven.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Start
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hauntedhaven.R
import com.example.hauntedhaven.Screen
import com.example.hauntedhaven.featuredListings





@Composable
fun HomeScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(PhantomBlack)

    ) {
        LazyColumn() {
            item {
                GreetingSection();
                FeaturedSection();
                viewAllListings(navController = navController)
            }

        }

    }
}


@Composable
fun GreetingSection() {
    Row(
        horizontalArrangement=Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,


        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),


    ) {

        Image(
            painter = painterResource(id = R.drawable.logohh2) ,
            contentDescription ="Logo",

        )
    }



    }



@Composable
fun BitSection(
    bits: List<String>)
{
var selectedBitIndex by remember {
    mutableStateOf(0)
}
    LazyRow{
        items(bits.size){
            Box(
                contentAlignment = Center,
                modifier = Modifier
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp)
                    .clickable {
                        selectedBitIndex = it
                    }
                    .clip(RoundedCornerShape(10.dp))
                    .background(
                        if (selectedBitIndex == it) BloodRed
                        else MoonlitViolet
                    )
                    .padding(15.dp)
            ) {
                Text(text = bits[it],
                    color = GhostWhite,
                fontFamily = FontFamily(Font(R.font.gothic)))

            }
        }
    }

}


@Composable
fun FeaturedSection() {
Column( modifier = Modifier
    .fillMaxWidth(),
    horizontalAlignment = Alignment.CenterHorizontally
    ) {
    Text(
        text = "Featured listings",
        color= GhostWhite,
        fontSize = 40.sp,
        fontFamily = FontFamily(Font(R.font.gothic)),
    modifier = Modifier
        .padding(15.dp)
    )
    }

    Row(
        horizontalArrangement = Arrangement.Start,
        modifier=Modifier
            .padding(17.dp)

    ) {
        Image(painter = painterResource(id = R.drawable.leap_website), contentDescription ="Leap Castle", Modifier.size(120.dp)
        )
        
        Text(
            text = "....",
            color= GhostWhite,
            fontFamily = FontFamily(Font(R.font.gothic)),
        modifier = Modifier
            .size(width = 100.dp, height = 50.dp)
            .padding(start = 10.dp)
            )

    }
    
    Row(horizontalArrangement = Start,
        modifier = Modifier.padding(17.dp)
    ) {
        Image(painter = painterResource(
            id = R.drawable.llhouseof7gables_jpg),
            contentDescription ="Haunted House 1",Modifier.size(120.dp) )
        Text(text = "Haunted house located in far...",color= GhostWhite, fontFamily = FontFamily(Font(R.font.gothic)),
        modifier = Modifier
            .size(width = 100.dp, height = 50.dp)
            .padding(start = 10.dp));

        LazyRow(){
            item {
                Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color.DarkGray)){
                    Text(text = "abandoned")}
                Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color.Red)){
                    Text(text = "haunted") }

            }
        }
    }

    Row(horizontalArrangement = Start,
        modifier = Modifier.padding(17.dp)
    ) {
        Image(painter = painterResource(
            id = R.drawable.hauntedchangi_main),
            contentDescription ="Haunted House 2",Modifier.size(120.dp) )
        Text(
            text = "This spooky hotel also offers a B&B..",
            color= GhostWhite,
            fontFamily = FontFamily(Font(R.font.gothic)),
            modifier = Modifier
                .size(width = 100.dp, height = 50.dp)
                .padding(start = 10.dp))


        LazyRow(){
            item {
                Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(halloweenOrange)){
                    Text(text = "spooky B&B")}
                    Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color.Red)){
                        Text(text = "haunted") }

                }
            }
    }

}

@Composable
fun viewAllListings(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .padding(17.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "And many more...",
            fontFamily = FontFamily(Font(R.font.gothic)),
        fontSize = 30.sp,
        color= GhostWhite)

    }

    Row(
        modifier= Modifier
            .padding(17.dp)
            .fillMaxWidth(),
    horizontalArrangement = Arrangement.Center
    ) {
        Button(onClick =
        {
        navController.navigate(Screen.ListingsPage.route)

        }
            ,colors = ButtonDefaults.buttonColors(BloodRed)) {
            Text(text = "Press to view all listings")

        }

    }


}


