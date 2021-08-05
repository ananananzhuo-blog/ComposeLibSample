package com.ananananzhuo.composelibnewsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.unit.dp
import com.ananananzhuo.composelib.*
import com.ananananzhuo.composelib.bean.ItemData
import com.ananananzhuo.composelibnewsample.ui.theme.ComposeLibNewSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        CommonUtils.setStatusBarColor(this)
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLibNewSampleTheme(darkTheme = false) {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    show1()
                }
            }
        }
    }
}

@Composable
fun show1() {
    val list = remember {
        mutableStateListOf(ItemData(content = "哈哈哈哈", title = "标题"))
    }
    ListView(datas = list, click = { data, index, id ->
        changedata(list, data, index, id)
    })

}

fun changedata(list: SnapshotStateList<ItemData>, data: ItemData, index: Int, id: Int) {
    list[index] = data.apply {
        content = "标题你变了"
        title = "title你变了"
    }
}
