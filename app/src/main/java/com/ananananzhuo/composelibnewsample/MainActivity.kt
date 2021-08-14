package com.ananananzhuo.composelibnewsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.rememberLazyListState
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
    val state = rememberLazyListState()
    ListView(datas = list, state, click = { data, index, id ->
//        changedata(list, data, index, id)
        list[index].content = "12334"
        changeData(list, index)
    })

}
