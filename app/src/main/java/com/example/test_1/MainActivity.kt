package com.example.test_1

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import com.example.test_1.ui.theme.TEST_1Theme

class App : Application()

class TestViewModel() : ViewModel() {

}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TEST_1Theme {

                Scaffold(
                    Modifier
                        .fillMaxSize(),
                    topBar = {
                        TopAppBar(
                            title = {
                                Text("Allah")
                            },
                        )
                    },
                ) {
                    Text(text = "Allah", Modifier.padding(8.dp))
                }

//                Surface(color = MaterialTheme.colors.background) {
//                    Column(
//                        Modifier.fillMaxSize(),
//                        verticalArrangement = Arrangement.Center,
//                        horizontalAlignment = Alignment.CenterHorizontally
//                    ) {
//                        Text(
//                            "Allah",
//                            style = MaterialTheme.typography.h1,
//                            modifier = Modifier.wrapContentSize(),
//                            textAlign = TextAlign.Center
//                        )
//                    }
//                }
            }
        }
    }
}