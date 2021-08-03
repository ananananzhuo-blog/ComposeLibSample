package com.ananananzhuo.composelib

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * author  :mayong
 * function:
 * date    :2021/8/2
 **/

@Composable
fun listItem(content: String) {
    Row(
        modifier = Modifier
            .padding(all = 10.dp)
            .border(width = 1.dp, color = Color.Green, shape = RoundedCornerShape(size = 10.dp))
            .fillMaxWidth(1f),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Image(
            modifier = Modifier
                .size(70.dp)
                .padding(all = 10.dp),
            painter = painterResource(id = R.drawable.apple),
            contentDescription = ""
        )
        Text(
            modifier = Modifier.padding(start = 10.dp),
            text = content, style = TextStyle(color = Color.Black, fontSize = 20.sp)
        )
    }
}