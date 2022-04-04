package com.ananananzhuo.composelib.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * author  :mayong
 * function:
 * date    :2022/4/3
 **/

/**

 * 确认事件弹出窗view

 * @param click 回调boolean类型  true：点击左边按钮，false：点击右边按钮

 */

@Composable
fun ConfirmDialogView(
    modifier: Modifier = Modifier,
    titleText: String,
    contentText: String,
    leftText: String = "取消",
    rightText: String = "确认",
    title: @Composable () -> Unit = {
        Text(
            text = titleText,
            Modifier.padding(top = 14.dp), style = TextStyle(fontSize = 18.sp)
        )
    },
    content: @Composable () -> Unit = {
        Text(
            text = contentText,
            Modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp),
            style = TextStyle(fontSize = 14.sp)
        )
    },
    left: @Composable () -> Unit = {
        Text(text = leftText, style = TextStyle(fontSize = 16.sp))
    },
    right: @Composable () -> Unit = {
        Text(text = rightText, style = TextStyle(fontSize = 16.sp, color = Color.Gray))
    },
    click: (Boolean) -> Unit) {
    Column(
        modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp, horizontal = 10.dp)
            .background(Color.White, RoundedCornerShape(8.dp)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        title()
        content()
        Divider(Modifier.padding(top = 20.dp), color = Color.Gray)
        Row(Modifier.height(50.dp)) {
            Box(
                Modifier
                    .weight(0.5f)
                    .fillMaxHeight()
                    .clickable {
                        click(false)

                    }, Alignment.Center
            ) {
                left()
            }
            Spacer(
                modifier = Modifier
                    .width(1.dp)
                    .fillMaxHeight()
                    .background(Color.Gray)
            )
            Box(
                Modifier
                    .weight(0.5f)
                    .fillMaxHeight()
                    .clickable {
                        click(true)
                    }, contentAlignment = Alignment.Center
            ) {
                right()
            }
        }
    }
}

@Preview
@Composable
fun ConfirmDialogPreview(){
    Box(
        Modifier
            .width(300.dp)
            .height(200.dp)) {
        ConfirmDialogView(titleText = "确认", contentText = "确认权限", click = {})
    }
}