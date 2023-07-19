package com.example.materialdesign.components.fixedLazyRow


import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.materialdesign.R

@Composable
fun PageFixedListing2(){
    LazyRow {
        item {
            Card(
                modifier = Modifier
                    .padding(all = 5.dp)
                    .size(100.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically ,
                    modifier = Modifier.clickable {
                        Log.e("LIST", "SUN CLICKED")
                    }) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(all = 10.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_sun),
                            contentDescription = ""
                        )
                        Text(text = "Sun", modifier = Modifier.padding(5.dp) )
                    }
                }
            }
        }

        item {
            Card(
                modifier = Modifier
                    .padding(all = 5.dp)
                    .size(100.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically ,
                    modifier = Modifier.clickable {
                        Log.e("LIST", "MOON CLICKED")
                    }) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(all = 10.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_moon),
                            contentDescription = ""
                        )
                        Text(text = "Moon", modifier = Modifier.padding(5.dp) )
                    }
                }
            }
        }
    }
}