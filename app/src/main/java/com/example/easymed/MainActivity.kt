package com.example.easymed

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.easymed.ui.theme.EasyMedTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EasyMedTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    MainScreen(navController)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopBar()
        },
        bottomBar = {
            BottomBar()
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { navController.navigate(route = "SCREEN_TWO") },
                containerColor = Color(0xFF1D80F3)) {
                Icon(Icons.Default.Add, contentDescription = "Add", tint =  Color(0xFF032043))
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            CustomNavHost(navController = navController)
        }
    }
}


@Composable
fun ScreenOne(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Screen One")
        Button(
            onClick = {
                navController.navigate("SCREEN_TWO")
            }
        ) {
            Text(text = "Next Screen")
        }
    }
}

@Composable
fun ScreenTwo(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Screen Two")
        Button(
            onClick = {
                navController.navigate("SCREEN_ONE")
            }
        ) {
            Text(text = "Next Screen")
        }
    }
}

@Composable
fun CustomNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = "SCREEN_ONE"
    ) {
        composable(route = "SCREEN_ONE") {
            ScreenOne(navController)
        }
        composable(route = "SCREEN_TWO") {
            ScreenTwo(navController)
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun EasyMedPreview() {
    EasyMedTheme {
        val navController = rememberNavController()
        MainScreen(navController)
    }
}