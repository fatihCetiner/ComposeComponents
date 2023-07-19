package com.example.materialdesign.components.cardView

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.materialdesign.R


@Composable
fun PageCard() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            modifier = Modifier
                .padding(all = 10.dp)
                .fillMaxWidth(),
            elevation = 10.dp,
            backgroundColor = Color.Blue,
            shape = RoundedCornerShape(corner = CornerSize(16.dp)),
            border = BorderStroke(2.dp, Color.Magenta)
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.clickable {
                    Log.e("CARD", "Clicked")
                }
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(all = 10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_sunny),
                        contentDescription = "Sunny"
                    )
                    Text(
                        text = "Sun",
                        color = Color.White,
                        fontSize = 36.sp
                    )
                }
            }
        }

    }
}