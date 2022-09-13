package com.example.firstapp

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstapp.ui.theme.FirstAppTheme


import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Box
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.ui.Alignment
import androidx.compose.material.icons.filled.Menu




@Composable
fun MyCard() {
    Surface(modifier = Modifier
        .padding(20.dp)
        .border(width = 1.dp, color = Color.Gray, RoundedCornerShape(3)),
        shape = RoundedCornerShape(3),
    ) {
        Column(modifier = Modifier
            .padding(top = 10.dp)
            .background(color = MaterialTheme.colors.background)
        ) {
                ProcessName("Кайдарова А. Н.")
                Row() {
                    Column() {
                        DateText(text = "Дата создания:")
                        DateBlocks("21.12.2012")
                    }
                    Column() {
                        DateText(text = "Исполнить до:")
                        DateBlocks("25.12.2012")
                    }
                }
            GetIcon()
            Row(modifier = Modifier
                .fillMaxWidth()
                .background(color = MaterialTheme.colors.secondary),
                verticalAlignment = Alignment.CenterVertically
            ) {
                GetImg()
                FromWho("Ардакова Н. С.")
            }
        }
    }
}


@Composable
fun GetIcon() {
    Box (
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .offset(x = 300.dp, y = 10.dp)
    ) {
        Icon(Icons.Filled.Menu, "menu")
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
    Surface(modifier = Modifier.padding(top = 1.dp, start = 20.dp)) {
        Text(text = text, fontSize = 14.sp)
    }
}

@Composable
fun FromWho(text: String) {
    Surface(modifier = Modifier
        .padding(start = 10.dp, top = 15.dp, bottom = 15.dp)
    ) {
        Text(text = "От $text", fontSize = 15.sp, color = Color.Black)
    }
}

@Composable
fun DateText(text: String) {
    Surface(modifier = Modifier
        .padding(top = 1.dp, start = 20.dp)) {
        Text(text = text, fontSize = 10.sp, color = Color.Gray)
    }
}

@Composable
fun GetImg() {
    Row(
        modifier = Modifier
        .padding(start = 20.dp, top = 15.dp, bottom = 15.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.person),
            contentDescription = "Дьявол",
            modifier = Modifier
                .size(20.dp)
                .clip(CircleShape)
        )
    }
}



@Preview(showBackground = true, widthDp = 400)
@Composable
fun DefaultPreview() {
    FirstAppTheme {
        MyCard()
    }
}
