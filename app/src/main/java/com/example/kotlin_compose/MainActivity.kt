package com.example.kotlin_compose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.kotlin_compose.ui.theme.Kotlin_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Kotlin_ComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    BasicComponentsScreen(
//                        modifier = Modifier.padding(innerPadding)
//                    )
                    ComponentesEstadosScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BasicComponentsScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(239, 247, 247))
    ) {
        Text(
            text = "Aulas Android",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF3DDC84),
            modifier = Modifier.align(Alignment.End)
        )
        Text(
            text = "com Jetpack Compose" ,
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color(66, 133, 244),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun ComponentesEstadosScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val valorCampo = remember {
            mutableStateOf("")
        }

        val idade = remember {
            mutableStateOf("")
        }

        TextField(
            value = valorCampo.value,
            onValueChange = {novoValor ->
                valorCampo.value= novoValor
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Uri,
                capitalization = KeyboardCapitalization.Words
            ),
            leadingIcon = {
                Icon(
                    imageVector =  Icons.Default.Email,
                    contentDescription = "sei la",
                    tint = Color(154, 82, 229, 255)
                )
            },
            label = {
                Text(text = "Nome e Sobrenome")
            }
        )
        TextField(
            value = idade.value,
            onValueChange = {novoValor ->
                idade.value= novoValor
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Uri,
                capitalization = KeyboardCapitalization.Words
            ),
            trailingIcon = {
                Icon(
                    imageVector =  Icons.Default.Face,
                    contentDescription = "sei la",
                    tint = Color(154, 82, 229, 255)
                )
            },
            label = {
                Text(text = "Idade")
            }
        )

    }
}