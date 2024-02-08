package com.example.qoutesgeneratingapp

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
public fun Quotes(string: String) {
    val context = LocalContext.current
    val buttonColor by remember { mutableStateOf(Color.Magenta) }

    Spacer(modifier = Modifier.padding(8.dp))
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .size(350.dp),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Text(
                text = string,
                style = TextStyle(
                    color = Color.White,
                    fontSize = 30.sp,
                    letterSpacing = 0.15.sp,
                    lineHeight = 40.sp,
                    fontFamily = MaterialTheme.typography.displayLarge.fontFamily,
                    fontWeight = FontWeight.Normal
                )
            )
            Spacer(modifier = Modifier.padding(16.dp))

            IconButton(
                onClick = {
                    shareTExt(context, string)
                    if (buttonColor == Color.Magenta) Color.Red else Color.White
                },
                modifier = Modifier
                    .size(80.dp)
                    .background(buttonColor, shape = CircleShape)
                    .align(Alignment.End)

            ) {
                Icon(imageVector = Icons.Default.Share, contentDescription = "Share")
            }
        }
    }
}

fun shareTExt(context: Context, text: String) {
    val sendIntent: Intent = Intent().apply {
        action = Intent.ACTION_SEND
        putExtra(Intent.EXTRA_TEXT, text)
        type = "text/plain"
    }
    val shereIntent = Intent.createChooser(sendIntent, null)
    context.startActivity(shereIntent)
}
