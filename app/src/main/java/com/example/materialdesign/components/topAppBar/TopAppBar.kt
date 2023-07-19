package com.example.materialdesign.components.topAppBar

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import com.example.materialdesign.R


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun PageTopAppBar() {
    val menuOpenControl = remember {
        mutableStateOf(false)
    }
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(text = "Title")
                        Text(text = "Sub Title", fontSize = 12.sp)
                    }
                },
                backgroundColor = colorResource(id = R.color.mainColor),
                contentColor = Color.White,
                actions = {
                    Text(
                        text = "Exit",
                        modifier = Modifier.clickable { Log.e("TAG", "Exit Clicked !") }
                    )
                    IconButton(onClick = {
                        Log.e("TAG", "Info Clicked !")
                    }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_info),
                            contentDescription = "Info"
                        )
                    }

                    IconButton(onClick = {
                        menuOpenControl.value = true
                    }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_more),
                            contentDescription = "More"
                        )
                    }
                    DropdownMenu(
                        expanded = menuOpenControl.value,
                        onDismissRequest = {
                            menuOpenControl.value = false
                        }) {
                        DropdownMenuItem(onClick = {
                            Log.e("TAG", "Menu Delete Clicked !")
                            menuOpenControl.value = false
                        }) {
                            Text(text = "Delete")
                        }
                        DropdownMenuItem(onClick = {
                            Log.e("TAG", "Menu Update Clicked !")
                            menuOpenControl.value = false
                        }) {
                            Text(text = "Update")
                        }
                    }
                }
            )
        },
        content = {

        }
    )
}