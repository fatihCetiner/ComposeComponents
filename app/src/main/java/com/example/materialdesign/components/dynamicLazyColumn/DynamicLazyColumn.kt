package com.example.materialdesign.components

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun PageDynamicListing(
    navController: NavController
){
    val countryList = remember {
        mutableStateListOf("Turkey","Italy","Germany","France","Egypt","U.S.A")
    }
    LazyColumn{
        items(
            count = countryList.count(),
            itemContent = {
                val country = countryList[it]

                Card(modifier = Modifier
                    .padding(all = 5.dp)
                    .fillMaxWidth()) {
                    Row(
                        modifier = Modifier.clickable {
                            Log.e("LIST", country)
                            navController.navigate("detail_page/$country")
                        }
                    ){
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier
                                .padding(all = 10.dp)
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = country,
                                modifier = Modifier.padding(5.dp)
                                    .clickable {
                                        Log.e("LIST","Text -> $country" )
                                    }
                            )

                            OutlinedButton(onClick = {
                                Log.e("LIST","Button -> $country" )
                                navController.navigate("detail_page/$country")
                            }) {
                                Text(text = "Choose Country")
                            }
                        }
                    }
                }
            }
        )
    }
}