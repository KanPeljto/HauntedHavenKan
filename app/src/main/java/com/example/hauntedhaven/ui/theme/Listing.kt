package com.example.hauntedhaven.ui.theme

import androidx.compose.ui.Modifier
import com.example.hauntedhaven.Screen

data class Listing(
    val title: String,
    val location: String,
    val image: Int,
    val category: listingCategory,
    val routee:String
)