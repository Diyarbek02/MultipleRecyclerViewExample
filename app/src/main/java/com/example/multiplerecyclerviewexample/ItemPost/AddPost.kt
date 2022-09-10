package com.example.multiplerecyclerviewexample.ItemPost

import com.example.multiplerecyclerviewexample.ListAndPostParent

data class AddPost(var list: List<Post>, var _type: Int): ListAndPostParent(_type)