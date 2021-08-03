package com.ananananzhuo.composelibnewsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ananananzhuo.composelib.listItem
import com.ananananzhuo.composelibnewsample.ui.theme.ComposeLibNewSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLibNewSampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    DefaultPreview()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    listItem(content = "")
    ComposeLibNewSampleTheme {
        LazyColumn {
            items(listOf(1, 2, 3, 4, 5, 6, 7, 8, 8)) {
                listItem(content = "安安安安卓: $it")
            }
        }
    }
}