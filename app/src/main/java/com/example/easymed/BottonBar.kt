package com.example.easymed

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun BottomBar() {
    BottomAppBar(
        containerColor = Color(0xFF1D80F3),
        contentColor = Color(0xFF032043),
    ) {
        Spacer(modifier = Modifier.weight(1f))
        BottomBarItem(icon = Icons.Filled.Home, contentDescription = "Home")
        Spacer(modifier = Modifier.weight(1f))
        BottomBarItem(icon = Icons.Filled.Info, contentDescription = "Pill")
        Spacer(modifier = Modifier.weight(1f))
        BottomBarItem(icon = Icons.Filled.Search, contentDescription = "Search")
        Spacer(modifier = Modifier.weight(1f))
        BottomBarItem(icon = Icons.Filled.Settings, contentDescription = "Settings")
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Composable
fun BottomBarItem(icon: ImageVector, contentDescription: String) {
    IconButton(onClick = { /* Handle navigation or actions here */ }) {
        Icon(
            icon,
            contentDescription = contentDescription,
            modifier = Modifier.size(32.dp) // Adjust the size as needed
        )
    }
}
