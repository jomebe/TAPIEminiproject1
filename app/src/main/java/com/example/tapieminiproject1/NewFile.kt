package com.example.tapieminiproject1

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.util.Log
import android.view.MotionEvent
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tapieminiproject1.ui.theme.TAPIEMiniProject1Theme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.colorspace.ColorSpace
import androidx.compose.ui.graphics.colorspace.Rgb
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavHostController
import com.example.tapieminiproject1.R.drawable.arrowleft
import com.google.firebase.annotations.concurrent.Background
import androidx.navigation.compose.NavHost


class NewFile : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bundle = intent.getBundleExtra("bundle")
        setContent {
            TAPIEMiniProject1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Input_title()
                }
            }
        }
    }
}

    @Composable
    fun Input_title() {
        var text1 by remember { mutableStateOf("") }
        var text2 by remember { mutableStateOf("") }
        Column {
            Spacer(modifier = Modifier.height(10.dp))
            OutlinedTextField(
                value = text1,
                onValueChange = { text1 = it },
                //placeholder = { Text(text = "ex") },

                label = { Text("타이틀을 입력해주세요.") },
                modifier = Modifier
                    .fillMaxWidth()

            )
            Spacer(modifier = Modifier.height(20.dp))
            OutlinedTextField(
                value = text2,
                onValueChange = { text2 = it },
                label = { Text("본문을 입력해주세요.") },
                modifier = Modifier
                    .fillMaxWidth()

            )
//            Button(onClick = {
//                val intent = Intent(this@MainActivity,RecentFile::class.java)
//                val bundle = Bundle()
//                intent.putExtra("bundle", bundle)
//                startActivity(intent)
//                finish()
//            }) {
//                Text(text = "사칙연산!!!")
//            }
        }
    }

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Print_menu(navController: NavHostController){
    Row {
        OutlinedButton(onClick = { navController.navigate("MainScreen") }) {
            Text("Back to MainScreen")
        }
        Image(
            painter = painterResource(id = arrowleft),
            contentDescription = stringResource(id = arrowleft),
            modifier = Modifier
                .width(60.dp)
                .height(110.dp)
                .padding(15.dp)
        )

        Spacer(modifier = Modifier.width(85.dp))
        Column {
            Spacer(modifier = Modifier.height(45.dp))
            Text(
                text = "Sunrin INT Product",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold
            )
        }
    }
}