package com.ananananzhuo.composelib

import android.text.TextUtils
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ananananzhuo.composelib.bean.ItemData

/**
 * author  :mayong
 * function:
 * date    :2021/8/2
 **/

@Composable
fun listItem(itemData: ItemData, onClick: () -> Unit = {}) {
    Column(
        Modifier
            .padding(horizontal = 10.dp, vertical = 5.dp)

            .clip(RoundedCornerShape(size = 10.dp))
            .border(
                width = 1.dp,
                color = Color(0, 153, 136),
                RoundedCornerShape(size = 10.dp)
            )
            .fillMaxWidth(1f)
            .clickable {
                onClick()
            }
            .padding(all = 10.dp)
    )
    {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Image(
                modifier = Modifier
                    .size(50.dp)
                    .padding(all = 10.dp),
                painter = painterResource(id = R.drawable.apple),
                contentDescription = ""
            )
            Text(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .weight(1f),
                text = itemData.title, style = TextStyle(color = Color.Black, fontSize = 20.sp)
            )
            Icon(
                imageVector = Icons.Filled.KeyboardArrowRight,
                tint = Color(0, 153, 136),
                contentDescription = ""
            )
        }
        if (!TextUtils.isEmpty(itemData.content)) {
            Column {
                Divider(color = Color(0, 153, 136), thickness = 0.7.dp)
                Text(
                    modifier = Modifier.padding(all = 3.dp),
                    text = itemData.content,
                    style = TextStyle(color = Color.Red)
                )
            }
        }
    }
}
