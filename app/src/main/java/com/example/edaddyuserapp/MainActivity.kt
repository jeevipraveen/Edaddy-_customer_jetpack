package com.example.edaddyuserapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column

import androidx.compose.material3.Text
import androidx.compose.material3.TextField

import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.unit.sp
import com.example.edaddyuserapp.ui.theme.EdaddyUserAppTheme
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EdaddyUserAppTheme {
                // A surface container using the 'background' color from the theme

                Column(modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Activity 1",
                        color = Color.Blue,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.padding(30.dp))
                    var resu by remember {
                        mutableStateOf("")
                    }

                    TextField(
                        value = resu,
                        onValueChange = { newText -> resu = newText },
                        label = { Text("Enter text")},
                        keyboardOptions = KeyboardOptions.Default.copy(
                            imeAction = ImeAction.Done
                        )
                    )
//                    Text(text = "You typed: ${resu.text}")
                    Spacer(modifier = Modifier.padding(30.dp))
                    Button(onClick = {
                        val i = Intent(this@MainActivity,MainActivity2::class.java)
                        i.putExtra("values",resu)
                        startActivity(i)
                    }) {
                        Text(text = "submit")
                        
                    }


                }
            }
        }
    }
}
@Preview
@Composable
fun PreviewMyComposableWithTextFieldValue() {
    EdaddyUserAppTheme{

    }
}