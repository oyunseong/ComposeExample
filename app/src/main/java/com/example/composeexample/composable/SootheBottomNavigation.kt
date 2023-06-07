package com.example.composeexample.composable


import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SootheBottomNavigation(modifier: Modifier = Modifier) {
    MaterialTheme {
        BottomNavigation(
            backgroundColor = MaterialTheme.colors.background,
            modifier = modifier
        ) {
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = null
                    )
                },
                label = {
                    Text("홈")
                },
                selected = true,
                onClick = {}
            )
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = null
                    )
                },
                label = {
                    Text("프로필")
                },
                selected = false,
                onClick = {}
            )
        }
    }

}