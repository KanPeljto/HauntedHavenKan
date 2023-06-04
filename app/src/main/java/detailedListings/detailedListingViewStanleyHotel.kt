package detailedListings

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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

@Composable
fun DetailedLayoutStanleyHotel(
    navController: NavController
) {
    LazyColumn(
        modifier=Modifier.background(PhantomBlack)
    ){
        item {
            Row(horizontalArrangement = Arrangement.SpaceBetween
                ,modifier= Modifier
                .background(PhantomBlack)
                .fillMaxWidth()
                ) {
                Image(painter = painterResource(
                    id = R.drawable.whitearrow2),
                    contentDescription ="back",
                modifier= Modifier
                    .clickable { navController.navigate(Screen.ListingsPage.route) }
                    .size(40.dp))

                Image(painter = painterResource(id = R.drawable.logohh2), contentDescription ="logo")

            }
            LazyRow(){
                item {
                    Image(painter = painterResource(id = R.drawable.hauntedchangi_main),
                        contentDescription ="ESP",
                    modifier= Modifier
                        .size(400.dp)
                        .background(PhantomBlack))
                    
                    Image(painter = painterResource(id = R.drawable.stanley2) ,
                        contentDescription ="ESP3",
                        modifier= Modifier
                            .size(400.dp)
                            .background(PhantomBlack))

                    Image(painter = painterResource(id = R.drawable.stanley3) ,
                        contentDescription ="ESP3",
                        modifier= Modifier
                            .size(400.dp)
                            .background(PhantomBlack))
                }
            }
            DescriptionStanleyHotel()
        }
    }

}



@Composable
fun DescriptionStanleyHotel() {
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
                text = "Location: Colorado, USA")
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
            
        }
    }
    
    
}




    







