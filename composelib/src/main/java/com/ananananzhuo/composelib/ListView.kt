package com.ananananzhuo.composelib

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import com.ananananzhuo.composelib.bean.ItemData

/**
 * author  :mayong
 * function:
 * date    :2021/8/5
 **/


@Composable
fun ListView(
    datas: MutableList<ItemData>,
    click: (data: ItemData, index: Int, id: Int) -> Unit
) {
    LazyColumn() {
        itemsIndexed(datas) { index, item ->
            item.id = index
            listItem(itemData = item, onClick = {
                click(item, index, item.id)
            })
        }
    }
}