package com.example.kotlin_compose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicSecureTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.TextObfuscationMode
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    var corDeFundo by remember {
        mutableStateOf(Color.White)
    }
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(corDeFundo)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        var valorCampo by remember {
            mutableStateOf("")
        }

        var idade by remember {
            mutableStateOf("")
        }

        var email by remember {
            mutableStateOf("")
        }

        var yLinux by remember {
            mutableStateOf(false)
        }

        var nLinux by remember {
            mutableStateOf(false)
        }

        var sConsole by remember {
            mutableStateOf("")
        }

        var favorite by remember {
            mutableStateOf(false)
        }

//        Spacer(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(22.dp)
//        )
//
//        TextField(
//            value = valorCampo,
//            onValueChange = {novoValor ->
//                valorCampo = novoValor
//            },
//            keyboardOptions = KeyboardOptions(
//                keyboardType = KeyboardType.Uri,
//                capitalization = KeyboardCapitalization.Words
//            ),
//            leadingIcon = {
//                Icon(
//                    imageVector =  Icons.Default.Email,
//                    contentDescription = "sei la",
//                    tint = Color(154, 82, 229, 255)
//                )
//            },
//            label = {
//                Text(text = "Nome e Sobrenome")
//            },
//            placeholder = {
//                Text(text = "Nome e Sobrenome")
//            },
//
//            colors = TextFieldDefaults.colors(
//                focusedTextColor = Color.Yellow,
//                unfocusedTextColor = Color.Green,
//                focusedPlaceholderColor = Color.Blue,
//                focusedLabelColor = Color.Red,
//
//
//            )
//        )
//        TextField(
//            value = idade,
//            onValueChange = {novoValor ->
//                idade = novoValor
//            },
//            keyboardOptions = KeyboardOptions(
//                keyboardType = KeyboardType.Password,
//                capitalization = KeyboardCapitalization.Words
//            ),
//            trailingIcon = {
//                Icon(
//                    imageVector =  Icons.Default.Face,
//                    contentDescription = "sei la",
//                    tint = Color(154, 82, 229, 255)
//                )
//            },
//            label = {
//                Text(text = "Idade")
//            }
//        )
//
//        OutlinedTextField(
//            value = email,
//            onValueChange = { email = it },
//            singleLine = true,
//            placeholder = {
//                Text("jkljkjlkjk")
//            },
//            colors = OutlinedTextFieldDefaults.colors(
//                focusedTextColor = Color.Yellow,
//                unfocusedTextColor = Color.Green,
//                unfocusedPlaceholderColor = Color.Black,
//                unfocusedBorderColor = Color.Green,
//                focusedBorderColor = Color.Red
//                ),
//
//            label = {
//                Text("asfdgffasdasdasd")
//            },
//            modifier = Modifier,
//            shape = RoundedCornerShape(topStart = 30.dp, bottomStart = 30.dp, topEnd = 30.dp, bottomEnd = 30.dp)
//        )
//
//        Text("Usaria Linux?")
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 30.dp),
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Checkbox(
//                checked = yLinux,
//                onCheckedChange = {yLinux = it },
//                colors = CheckboxDefaults.colors(
//                    checkedColor = Color.DarkGray
//                ),
//                modifier = Modifier,
//            )
//            Text("Sim")
//        }
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 30.dp),
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Checkbox(
//                checked = nLinux,
//                onCheckedChange = {nLinux = it},
//                colors = CheckboxDefaults.colors(
//                    checkedColor = Color.DarkGray
//                ),
//                modifier = Modifier,
//            )
//            Text("Não")
//        }



        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = sConsole == "Playstation",
                onClick = {
                    sConsole = "Playstation"
                }
            )
            Text("Playstation")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = sConsole == "Nintendo",
                onClick = {
                    sConsole = "Nintendo"
                }
            )
            Text("Nintendo")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = sConsole == "Xbox",
                onClick = {
                    sConsole = "Xbox"
                }
            )
            Text("Xbox")
        }


        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(
                modifier = Modifier,
                onClick = {
                    corDeFundo = Color.Cyan
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,
                    contentColor = Color.Black
                ),
                border = BorderStroke(width = 6.dp, Color.Green),
                shape = RoundedCornerShape(topEnd = 90.dp, topStart = 90.dp, bottomStart = 90.dp, bottomEnd = 90.dp)
            ) {
                Text(text = "Clique aqui?")

                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = ""
                )
            }
            OutlinedButton(
                modifier = Modifier,
                onClick = {
                    corDeFundo = Color.Magenta
                },
                border = BorderStroke(width = 6.dp, Color.Green),
                shape = RoundedCornerShape(topEnd = 90.dp, topStart = 90.dp, bottomStart = 90.dp, bottomEnd = 90.dp)
            ) {
                Text(text = "cookie?")

                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = ""
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            if (favorite){
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "Favorite icon",
                    modifier = Modifier
                        .size(40.dp)
                        .clickable{
                            favorite = false
                        }
                )
            }else {
                Icon(
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = "Favorite icon border",
                    modifier = Modifier
                        .size(40.dp)
                        .clickable{
                            favorite = true
                        }
                )
            }
        }

    }
}