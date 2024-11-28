package com.example.easymed

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TopBar() {
    BottomAppBar(
        containerColor = Color(0xFF1D80F3),
        contentColor = Color(0xFF032043),
    ) {
        TopBarItem(icon = Icons.Filled.AccountCircle, contentDescription = "Profile")
        Spacer(modifier = Modifier.weight(0.1f))
        Text("Paciente",  fontSize = 30.sp)
        TopBarItem(icon = Icons.Filled.ArrowDropDown, contentDescription = "Arrow")
        Spacer(modifier = Modifier.weight(1f))
        TopBarItem(icon = Icons.Filled.DateRange, contentDescription = "Date")
    }
}

@Composable
fun TopBarItem(icon: ImageVector, contentDescription: String) {
    IconButton(onClick = { /* Handle navigation or actions here */ }) {
        Icon(icon, contentDescription = contentDescription,  modifier = Modifier.size(40.dp))
    }
}