package com.example.firstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstapp.ui.theme.FirstAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    MyCard()
                }
            }
        }
    }
}

@Composable
fun MyCard() {
    Surface(modifier = Modifier.padding(20.dp)
        .border(width = 1.dp, color = Color.Gray, RoundedCornerShape(3))
        ) {
        Column(modifier = Modifier
            .padding(top = 10.dp)
            .background(color = MaterialTheme.colors.background)) {
            ProcessName("Кайдарова А. Н.")
            Row() {
                Column() {
                    dateText(text = "Дата создания:")
                    DateBlocks("21.12.2012")
                }
                Column() {
                    dateText(text = "Исполнить до:")
                    DateBlocks("25.12.2012")
                }
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
                .background(color = MaterialTheme.colors.primary)
                .border(width = 1.dp, color = Color.Gray, RoundedCornerShape(3))
            ) {
                    fromWho("Ардакова Н. С.")
            }
        }
    }
}

@Composable
fun ProcessName(text: String) {
    Surface(modifier = Modifier.padding(vertical = 10.dp, horizontal = 20.dp)) {
        Text(text = "Подготовка служебной записки\nна $text")
    }
}
@Composable
fun DateBlocks(text: String) {
    Surface(modifier = Modifier.padding(vertical = 1.dp, horizontal = 20.dp)) {
        Text(text = text)
    }
}
@Composable
fun fromWho(text: String) {
    Surface(modifier = Modifier
        .padding(horizontal = 20.dp, vertical = 20.dp)
        .background(color = MaterialTheme.colors.background)
    ) {
        Text(text = "от $text", fontSize = 15.sp, color = Color.Blue)
    }
}
@Composable
fun dateText(text: String) {
    Surface(modifier = Modifier
        .padding(top = 1.dp, start = 20.dp)) {
        Text(text = text, fontSize = 10.sp, color = Color.Gray)
    }
}


@Preview(showBackground = true, widthDp = 320)
@Composable
fun DefaultPreview() {
    FirstAppTheme {
        MyCard()
    }
}