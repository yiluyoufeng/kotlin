package com.example.kotlin.design.observer

import android.util.Log

class StockObserver(val name: String, val sub: Secretary) {

    fun update(){
        Log.i("AHF","${sub.action},${name}关闭股票行情，继续工作")
    }
}