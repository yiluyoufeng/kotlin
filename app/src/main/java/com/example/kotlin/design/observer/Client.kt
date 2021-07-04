package com.example.kotlin.design.observer

class Client {

    fun main() {
        val secretary = Secretary()
        val observer1 = StockObserver("AHF", secretary)
        val observer2 = StockObserver("JJS", secretary)

        secretary.registerObserver(observer1)
        secretary.registerObserver(observer2)

        secretary.action = "老板来了"
        secretary.notifyObserver()
    }
}