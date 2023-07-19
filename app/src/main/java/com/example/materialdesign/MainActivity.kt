package com.example.materialdesign


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.materialdesign.components.PageDynamicListing
import com.example.materialdesign.components.dynamicLazyColumn.DetailPage
import com.example.materialdesign.ui.theme.MaterialDesignTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialDesignTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Navigation()
                }
            }
        }
    }
}

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "page") {

        composable("page") {
            PageDynamicListing(navController = navController)
        }

        composable("detail_page/{countryName}", arguments = listOf(
            navArgument("countryName") { type = NavType.StringType }
        )) {
            val countryName = it.arguments?.getString("countryName")!!
            DetailPage(countryName = countryName)
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MaterialDesignTheme {

    }
}












