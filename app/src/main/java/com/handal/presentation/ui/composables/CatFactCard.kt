package com.handal.presentation.ui.composables

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

//@OptIn(InternalLayoutApi::class)
@Composable
fun CatFactCard(text: String, onClick: () -> Unit) {
    Surface(
        shape = RoundedCornerShape(8.dp),
        elevation = 8.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CatFactText(text = text)
           // Spacer(modifier = Modifier.preferredHeight(16.dp))
            Spacer(modifier = Modifier)
            CatFactButton(onClick = onClick)
        }
    }
}
// modifier = Modifier.padding(16.dp) + Modifier.fillMaxWidth(),
//            horizontalAlignment = Alignment.CenterHorizontally