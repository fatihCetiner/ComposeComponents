package com.example.materialdesign.components.topAppBarSearch

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.materialdesign.R


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun PageTopAppBarSearch() {
    val isSearch = remember {
        mutableStateOf(false)
    }
    val tfSearch = remember {
        mutableStateOf("")
    }
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    if (isSearch.value) {
                        TextField(
                            value = tfSearch.value,
                            onValueChange = {
                                tfSearch.value = it
                                Log.e("TAG", "Search : $it")
                            },
                            label = { Text(text = "Search") },
                            colors = TextFieldDefaults.textFieldColors(
                                backgroundColor = Color.Transparent,
                                focusedLabelColor = Color.White,
                                focusedIndicatorColor = Color.White,
                                unfocusedLabelColor = Color.White,
                                unfocusedIndicatorColor = Color.White
                            )
                        )
                    } else {
                        Text(text = "Title")
                    }
                },
                actions = {
                    if (isSearch.value) {
                        IconButton(onClick = {
                            isSearch.value = false
                            tfSearch.value = ""
                        }) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_close),
                                contentDescription = "Close"
                            )
                        }
                    } else {
                        IconButton(onClick = {
                            isSearch.value = true
                        }) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_search),
                                contentDescription = "Search"
                            )
                        }
                    }
                }
            )
        },
        content = {

        }
    )
}