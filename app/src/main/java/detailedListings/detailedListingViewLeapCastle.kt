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
fun DetailedLayoutLeapCastle(
    navController: NavController
) {
    LazyColumn(
        modifier=Modifier.background(PhantomBlack)
    ){
        item {
            TopBarDetailed(title = "Leap Castle", navController = navController)

            LazyRow(){
                item {
                    Image(painter = painterResource(id = R.drawable.leap_website),
                        contentDescription ="ESP",
                    modifier= Modifier
                        .size(400.dp)
                        .background(PhantomBlack))
                    
                    Image(painter = painterResource(id = R.drawable.leap2) ,
                        contentDescription ="ESP3",
                        modifier= Modifier
                            .size(400.dp)
                            .background(PhantomBlack))

                    Image(painter = painterResource(id = R.drawable.leap3) ,
                        contentDescription ="ESP3",
                        modifier= Modifier
                            .size(400.dp)
                            .background(PhantomBlack))


                }
            }
            DescriptionLeapCastle(navController = navController)
        }
    }

}



@Composable
fun DescriptionLeapCastle(navController: NavController) {
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
                text = "Location: Ireland")
            Text(
                fontFamily = FontFamily(Font(R.font.gothic)),
                color = GhostWhite,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(start = 10.dp)
                    .padding(top = 10.dp),
                text = "The world's most haunted Castle. A turbulent and bloody history, used as a fortress, home and tomb. Leap Castle is home to many fascinating and sometimes horrific spirits. Built in the early 1500's under the supervision of the powerful and warring O'Carroll clan, Leap Castle has been the centre of much bloodshed and brutal atrocities."

            )
            Spacer(modifier = Modifier.height(30.dp))
            Column(
                modifier = Modifier.padding(start = 10.dp, bottom = 10.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Event time: ", fontWeight = FontWeight.Bold, color = GhostWhite)
                    Text(text = "8:00PM-2:00AM", color = GhostWhite)
                }
                Row(
                    modifier = Modifier.fillMaxWidth()
                ){
                    Text(text = "Event price: ", fontWeight = FontWeight.Bold, color = GhostWhite)
                    Text(text = "$42.00 per person", color = GhostWhite)
                }
                Row(
                    modifier = Modifier.fillMaxWidth()
                ){
                    Text(text = "Event date: ", fontWeight = FontWeight.Bold, color = GhostWhite)
                    Text(text = "1 August, 2023", color = GhostWhite)
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




    







