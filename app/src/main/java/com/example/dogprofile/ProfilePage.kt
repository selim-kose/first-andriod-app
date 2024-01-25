package com.example.dogprofile

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProfilePage() {
    Card(elevation = CardDefaults.cardElevation(3.dp), modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 20.dp, vertical = 100.dp)

    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            //painterResource anger vart bilden befinner sig. Man behöver först lägga till bilden som en drawable i resource manager
            Image(
                painter = painterResource(id = R.drawable._d96ce23_4b6a_49eb_93b8_ff675b0aaf3d),
                contentDescription = "Ball",
                modifier = Modifier // Med modifier kan vi ändra en bilds attribut
                    .size(200.dp)
                    .clip(CircleShape)
                    .border(width = 2.dp, color = Color.Red, shape = CircleShape),
                contentScale = ContentScale.Crop // Gör att bilden fyller ut sin container och cropas där det behövs

            )

            Text(text = "Amerikansk Fotboll")
            Text(text = "Sweden")
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                ProfileStats(count = "150", title = "Followers")
                ProfileStats(count = "100", title = "Following")
                ProfileStats(count = "110", title = "Followers")
            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Button(onClick = { }) {
                    Text(text = "Follow")
                }
                Button(onClick = { }, shape = ButtonDefaults.outlinedShape) {
                    Text("test")
                }
            }
        }
    }
}


@Composable
fun ProfileStats(count: String, title: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = count, fontWeight = FontWeight.Bold)
        Text(text = title, fontWeight = FontWeight.Bold)
    }

}

//Preview annoteringen ser till att vi kan se resultatet av vår kod
@Preview(showBackground = true)
@Composable
fun ProfilePagePreview() {
    ProfilePage()
}
