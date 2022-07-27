package com.handal.presentation.ui.composables
import androidx.compose.material.Text
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.runtime.Composable

@Composable
fun  CatFactText( text:String) {
    Text(
        text = text,
        style = typography.h6
    )
}