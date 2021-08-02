package com.ananananzhuo.composelib

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

/**
 * author  :mayong
 * function:
 * date    :2021/8/2
 **/

@Composable
fun listItem() {
    Image(painter = painterResource(id = R.drawable.apple), contentDescription = "")
}