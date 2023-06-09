package detailedListings

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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.hauntedhaven.R
import com.example.hauntedhaven.Screen
import com.example.hauntedhaven.ui.theme.GhostWhite
import com.example.hauntedhaven.ui.theme.PhantomBlack
import com.example.hauntedhaven.ui.theme.TopBarDetailed

@Composable
fun DetailedLayoutTowerOfLondon(
    navController: NavController
) {
    Box(
        modifier = Modifier.background(PhantomBlack).fillMaxSize()
    ) {
        LazyColumn(
            modifier = Modifier.background(PhantomBlack)
        ) {
            item {
                TopBarDetailed(
                    title = "Tower of London",
                    navController = navController
                )
                LazyRow() {

                    item {

                        Image(
                            painter = painterResource(id = R.drawable.london2),
                            contentDescription = "ESP",
                            modifier = Modifier
                                .size(400.dp)
                                .background(PhantomBlack)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.london3),
                            contentDescription = "ESP3",
                            modifier = Modifier
                                .size(400.dp)
                                .background(PhantomBlack)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.london4),
                            contentDescription = "ESP3",
                            modifier = Modifier
                                .size(400.dp)
                                .background(PhantomBlack)
                        )

                    }
                }
                DescriptionTowerOfLondon(navController = navController)
            }
        }

    }
}



@Composable
fun DescriptionTowerOfLondon(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(PhantomBlack)
    ){

        Column() {
            Text(
                fontFamily = FontFamily(Font(R.font.gothic)),
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 25.sp,
                modifier = Modifier
                    .padding(start = 10.dp)
                    .padding(top = 10.dp),
                text = "Location: London, United Kingdom")
            Text(
                fontFamily = FontFamily(Font(R.font.gothic)),
                color = GhostWhite,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(start = 10.dp)
                    .padding(top = 10.dp),
                text = "Once considered among the royal palaces, the Tower of London is most known as a political prison and a place of execution. "
                        + "\n" +
                        "Its history goes all the way back to William I the Conqueror who began to erect fortifications on the site immediately after his coronation on Christmas 1066."
            )
            Spacer(modifier = Modifier.height(30.dp))
            Column(
                modifier = Modifier.padding(start = 10.dp, bottom = 10.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Event time: ", fontWeight = FontWeight.Bold, color = GhostWhite)
                    Text(text = "11:00PM-3:30AM", color = GhostWhite)
                }
                Row(
                    modifier = Modifier.fillMaxWidth()
                ){
                    Text(text = "Event price: ", fontWeight = FontWeight.Bold, color = GhostWhite)
                    Text(text = "$36 per person", color = GhostWhite)
                }
                Row(
                    modifier = Modifier.fillMaxWidth()
                ){
                    Text(text = "Event date: ", fontWeight = FontWeight.Bold, color = GhostWhite)
                    Text(text = "8 April, 2023", color = GhostWhite)
                }

            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(top = 10.dp, start = 10.dp)
            ) {
                Button(onClick = { navController.navigate(Screen.success.route) }, modifier = Modifier.background(GhostWhite), colors = ButtonDefaults.buttonColors(
                    GhostWhite)) {
                    Text(text="Book now", color = PhantomBlack)
                }
            }
            
        }


    }
    
    
}




    







