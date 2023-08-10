package com.example.eventolivraria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eventolivraria.ui.theme.EventoLivrariaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EventoLivrariaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background                ) {
                    LibraryGreetingWithImage(message = "Convite", from = "Livraria")
                }
            }
        }
    }
}

@Composable
fun LibraryGreetingWithImage(message: String, from:String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidlibrary)
    Box {
        Image(
            painter = image,
            contentDescription = null
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        )
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Text(
        text = message,
        fontSize = 90.sp,
        lineHeight = 116.sp,
        textAlign = TextAlign.Center,
        color = Color.White,

    )
    Text(
        text = from,
        fontSize = 36.sp,
        color = Color.LightGray,
        modifier = with(Modifier) {
            padding(top = 620.dp)
                .padding(end = 6.dp)
                .padding(start = 30.dp)
                .background(Color.Gray)
        }
    )
}
@Preview(showBackground = true)
@Composable
fun LibraryEventPreview() {
    EventoLivrariaTheme {
        LibraryGreetingWithImage("Seja Bem Vindo!", "The House of Book" )
    }
}
