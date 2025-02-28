package com.example.nuevaclase27feb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nuevaclase27feb.ui.theme.NuevaClase27FebTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NuevaClase27FebTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Box( // CAMBIAMOS ROW POR COLUMN
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
        ) {
            Column(
                modifier = Modifier.align(Alignment.Center) // Centra todo el contenido dentro del Box
            ) {
                Text(
                    text = "Andres",
                    color = Color.Blue,
                    fontSize = 28.sp
                )
                Spacer(modifier = Modifier.height(16.dp)) // Espacio manual entre textos
                Text(text = "Bedoya", color = Color.Red)
                Spacer(modifier = Modifier.height(16.dp)) // Espacio manual entre textos

                Text(text = "18 años", color = Color.Green)
            }
        }
    }
}





@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NuevaClase27FebTheme {
        Greeting("Android")
    }
}
