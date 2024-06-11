package com.example.tapieminiproject1

import android.graphics.Paint.Style
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tapieminiproject1.ui.theme.TAPIEMiniProject1Theme
import com.example.tapieminiproject1.R.drawable.*
import com.example.tapieminiproject1.R.string.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TAPIEMiniProject1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "MainScreen") {
                        composable("MainScreen") { PrintMenu(navController) }
                        composable("NewFile") { NewFileScreen(navController) }
                        composable("RecentFile") { RecentFileScreen(navController) }

                    }
                }
            }
        }
    }
}
    @Composable
    private fun PrintMenu(navController: NavHostController) {
        Column(modifier = Modifier.padding(16.dp)) {
            Spacer(modifier = Modifier.height(45.dp))
            Row {
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "Sunrin INT Product",
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.weight(1f))
            }
            Spacer(modifier = Modifier.height(20.dp))

            Divider(
                color = Color.Black,
                thickness = 1.dp,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(10.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = search),
                    contentDescription = stringResource(id = search),
                    modifier = Modifier.size(20.dp)
                )
                Text(text = " 검색")
            }
            Spacer(modifier = Modifier.height(10.dp))
            Divider(
                color = Color.Black,
                thickness = 1.dp,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(10.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = file),
                    contentDescription = stringResource(id = file),
                    modifier = Modifier.size(20.dp)
                )
                Text(text = " 최근 파일")
                Spacer(modifier = Modifier.width(10.dp))
                Button(onClick = { navController.navigate("RecentFile") }) {
                    Text("최근 파일")
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Divider(
                color = Color.Black,
                thickness = 1.dp,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(10.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = fileplus),
                    contentDescription = stringResource(id = fileplus),
                    modifier = Modifier.size(20.dp)
                )
                Text(text = " 추가")
                Spacer(modifier = Modifier.width(10.dp))
                Button(onClick = { navController.navigate("NewFile") }) {
                    Text("추가")
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Divider(
                color = Color.Black,
                thickness = 1.dp,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(20.dp))

        }
    }

    @Composable
    fun RecentFileScreen(navController: NavHostController) {
        Column {
            Spacer(modifier = Modifier.height(24.dp))
            Row {
  Spacer(modifier = Modifier.width(16.dp))
                Text(text = "최근파일", style = TextStyle(fontSize = 25.sp))
                
            }
            Spacer(modifier = Modifier.height(28.dp))
            Row {

                Spacer(modifier = Modifier.width(16.dp))
                Image(
                    painter = painterResource(id = file),
                    contentDescription = stringResource(id = file),
                    modifier = Modifier.size(20.dp)
                )
                Text(text = "  Sunrin INT Prodcut", style = TextStyle(fontSize = 20.sp))
                Spacer(modifier = Modifier.width(120.dp))
                Text(text = "2024.5.30", style = TextStyle(color = Color.Gray, fontSize = 20.sp))
            }
            Spacer(modifier = Modifier.height(24.dp))
            Row {

                Spacer(modifier = Modifier.width(16.dp))
                Image(
                    painter = painterResource(id = file),
                    contentDescription = stringResource(id = file),
                    modifier = Modifier.size(20.dp)
                )
                Text(text = "  Sunrin INT Prodcut", style = TextStyle(fontSize = 20.sp))
                Spacer(modifier = Modifier.width(120.dp))
                Text(text = "2024.5.30", style = TextStyle(color = Color.Gray, fontSize = 20.sp))
            }
            Spacer(modifier = Modifier.height(24.dp))
            Row {

                Spacer(modifier = Modifier.width(16.dp))
                Image(
                    painter = painterResource(id = file),
                    contentDescription = stringResource(id = file),
                    modifier = Modifier.size(20.dp)
                )
                Text(text = "  Sunrin INT Prodcut", style = TextStyle(fontSize = 20.sp))
                Spacer(modifier = Modifier.width(120.dp))
                Text(text = "2024.5.30", style = TextStyle(color = Color.Gray, fontSize = 20.sp))
            }
            Spacer(modifier = Modifier.height(24.dp))
            Row {

                Spacer(modifier = Modifier.width(16.dp))
                Image(
                    painter = painterResource(id = file),
                    contentDescription = stringResource(id = file),
                    modifier = Modifier.size(20.dp)
                )
                Text(text = "  Sunrin INT Prodcut", style = TextStyle(fontSize = 20.sp))
                Spacer(modifier = Modifier.width(120.dp))
                Text(text = "2024.5.30", style = TextStyle(color = Color.Gray, fontSize = 20.sp))
            }
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = { navController.navigate("MainScreen") }) {
                Text("Back to MainScreen")
            }
        }
    }

@Composable
fun NewFileScreen(navController: NavHostController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Print_menu()
        Input_title()

        Button(onClick = { navController.navigate("MainScreen") }) {
            Text("Back to MainScreen")
        }
    }
}