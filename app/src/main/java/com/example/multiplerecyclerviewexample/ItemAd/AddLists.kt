package com.example.multiplerecyclerviewexample.ItemAd

import com.example.multiplerecyclerviewexample.ListAndPostParent

data class AddLists(var list: List<Ad>, var _type: Int ) : ListAndPostParent(_type)