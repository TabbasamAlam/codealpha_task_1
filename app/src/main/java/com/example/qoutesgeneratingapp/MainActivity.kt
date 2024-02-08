package com.example.qoutesgeneratingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.qoutesgeneratingapp.ui.theme.QoutesGeneratingAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QoutesGeneratingAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color=Color.Yellow
                ) {
                    MyQouteApp()
                }

            }
        }
    }
}
@Composable
fun MyQouteApp() {
    var listitem by rememberSaveable { mutableStateOf(-1) }//start with -1 so that we can access first element of list after calling
    var listof by remember { mutableStateOf(false) }

    var gradientColors by remember {
        mutableStateOf(
            listOf(
                Color.Red,
                Color.Black,
                Color.White,
                Color.Magenta,
                Color.Yellow
            )
        )
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Button(
            onClick = {
                listof = true
                listitem = (listitem + 1) % quoteFunctions.size
            },
            modifier = Modifier
                .background(
                    brush = Brush.linearGradient(colors = gradientColors)
                )


        ) {
            Text(
                text = "View Quotes",
                color = Color.White,
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,

                )
        }
        if (listof == true) {
            quoteFunctions[listitem].content()
           IconButton(onClick = {
               listitem = (listitem - 1) % quoteFunctions.size
           },
               modifier =
               Modifier.align(Alignment.Start)
           ) {
               Icon(imageVector = Icons.Default.ArrowBack ,
                   contentDescription = "Previous" ,
                   modifier =
                Modifier.size(40.dp))

           }
        }
    }
msg()
}

@Composable
fun msg() {

    Column() {

        Text(
            text = "Developed by Tabbasam Alam",
            color = Color.Black,
            fontSize = 22.sp,
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(start = 50.dp)
        )
    }
}

@Preview
@Composable
fun dis() {
    MyQouteApp()

}
