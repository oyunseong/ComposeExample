package com.example.composeexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeexample.composable.ReceiveMessageCard
import com.example.composeexample.composable.SootheBottomNavigation
import com.example.composeexample.ui.theme.ComposeExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeExampleTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Conversation(message = mockMessage)
                    SootheBottomNavigation()
                }
            }
        }
    }

    @Composable
    fun Conversation(message: List<Message>) {
        LazyColumn {
            items(message) { message ->
                ReceiveMessageCard(message = message)
            }
        }
    }

    @Preview
    @Composable
    fun PreviewMessageCard() {
        ComposeExampleTheme {
            Surface {
                Conversation(message = mockMessage)
            }
        }
    }
}

