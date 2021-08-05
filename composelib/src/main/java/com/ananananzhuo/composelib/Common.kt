package com.ananananzhuo.composelib

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

/**
 * author  :mayong
 * function:
 * date    :2021/8/4
 **/

@Composable
fun buildTopBar(title: String = "公众号：安安安安卓") {
    TopAppBar(backgroundColor = Color(0, 153, 136)) {
        Image(
            modifier = Modifier.padding(all = 8.dp),
            painter = painterResource(id = R.drawable.apple_alpha),
            contentDescription = ""
        )
        Text(
            modifier = Modifier.padding(start = 8.dp),
            text = title,
            style = TextStyle(color = Color.White)
        )
    }
}