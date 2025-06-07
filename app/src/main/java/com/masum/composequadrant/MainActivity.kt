package com.masum.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.masum.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun QuadrantScreen() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            Cards(
                title = "Text composable",
                description = "Displays text and follows Material Design guidelines.",
                Modifier.weight(1f),
                backgroundColor = Color(0xFFEADDFF)
            )
            Cards(
                title = "Image composable",
                description = "Creates a composable that lays out and draws a given painter class.",
                Modifier.weight(1f),
                backgroundColor = Color(0xFFFFD180)
            )
        }
        Row(Modifier.weight(1f)) {
            Cards(
                title = "Row composable",
                description = "A layout composable that places its children in a horizontal sequence.",
                Modifier.weight(1f),
                backgroundColor = Color(0xFFB9FBC0)
            )
            Cards(
                title = "Column composable",
                description = "A layout composable that places its children in a vertical sequence.",
                Modifier.weight(1f),
                backgroundColor = Color(0xFFCFD8DC)
            )
        }
    }
}

@Composable
fun Cards(
    title: String,
    description: String,
    backgroundColor: Color
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
    }
}