package com.example.kotlin.design.observer

class Secretary {
    val observers = mutableListOf<StockObserver>()

    var action: String? = null

    fun registerObserver(observer: StockObserver) {
        observers.add(observer)
    }

    fun notifyObserver(){
        for (observer in observers) {
            observer.update()
        }
    }
}