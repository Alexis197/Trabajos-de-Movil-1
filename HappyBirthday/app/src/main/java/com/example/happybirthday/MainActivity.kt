package com.example.happybirthday

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingWithText(message = "Hola Alex", from ="Ema", from1 ="Ema")
                }
            }
        }
    }
}
@Composable
fun BirthdayGreetingWithText(message: String, from: String, from1: String){
    Column() {
        Text(text = message, fontSize = 36.sp)
        Text(text = from, fontSize = 20.sp)
        Text(text = from1, fontSize = 20.sp)
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HappyBirthdayTheme {
        BirthdayGreetingWithText(message = "Hola Alex", from="from Ema")

    }
}