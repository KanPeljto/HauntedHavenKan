package com.example.hauntedhaven.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hauntedhaven.R
import com.example.hauntedhaven.Screen

@Composable
fun ListingScreen() {
    Row(
        horizontalArrangement= Arrangement.Center,
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



@Preview(showBackground = true)
@Composable
fun ListingPreview() {
    HauntedHavenTheme {
        ListingScreen()

    }
}