package com.example.kotlin.chapter2.`fun`

class ListTest {

    var list = listOf<String>("origin", "pear", "banana", "orange", "watermelon")

    fun test() {
        list.any{it.length >5}
        list.all { it.length > 2 }
    }
}