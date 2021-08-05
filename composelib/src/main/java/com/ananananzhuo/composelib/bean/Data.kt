package com.ananananzhuo.composelib.bean

/**
 * author  :mayong
 * function:
 * date    :2021/8/5
 **/

/**
 * id和tag都是用来表示唯一id的，id是item序号，tag是自定义的字符串序号用哪个都行
 */
data class ItemData(
    var id: Int=0,
    var content: String = "",
    var title: String = "",
    var tag: String = ""
)