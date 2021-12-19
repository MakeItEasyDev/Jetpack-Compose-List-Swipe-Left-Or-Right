package com.jetpack.swipeleftright

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AlertDialogs(
    openDialog: MutableState<Boolean>,
    text: String
) {
    if (openDialog.value) {
        AlertDialog(
            onDismissRequest = {
                openDialog.value = false
            },
            title = {
                Text(
                    text = "Alert Dialog!",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            },
            text = {
                Text(text = text)
            },
            buttons = {
                Row(
                    modifier = Modifier
                        .padding(top = 10.dp, bottom = 15.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Button(
                        onClick = {
                            openDialog.value = false
                        },
                        modifier = Modifier
                            .fillMaxWidth(0.4f)
                            .padding(end = 10.dp)
                    ) {
                        Text(text = "Submit")
                    }
                }
            }
        )
    }
}
















