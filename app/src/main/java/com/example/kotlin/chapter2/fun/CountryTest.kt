package com.example.kotlin.chapter2.`fun`

import com.example.kotlin.data.Country

class CountryTest {

    fun isBigEuropeanCountry(country: Country): Boolean {
        return country.continient == "EU" && country.population > 1000
    }


    fun sum(x: Int, y: Int) = x + y

    fun sum(x: Int) = { y: Int ->
        x + y
    }

    fun test() {
        sum(1, 2)

        sum(1)(2)

        curryingLike("Looks like curring style") { con ->
            var temp = con.hashCode()
            print(temp)
        }
    }

    /***
     * 高阶函数，参数或者返回值是个函数
     */
    fun curryingLike(content: String, block: (String) -> Unit) {
        block(content)
    }

    fun num1AndNum2(num1: Int, num2: Int, block: (Int, Int) -> Int): Int {
        return block(num1, num2)
    }

    fun plus(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun minus(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun main() {
        val num1 = 200
        val num2 = 100
        val result1 = num1AndNum2(num1, num2, ::plus)
        val result2 = num1AndNum2(num1, num2, ::minus)
    }

    //内联函数
    inline fun num1AndNum2Temp(num1: Int, num2: Int, block: (Int, Int) -> Int): Int {
        return block(num1, num2)
    }

    inline fun inlineTest(block: (Int, Int) -> Int, noinline block2: (Int) -> Unit) {

    }


    fun runRunnable(block:()->Unit) {
        val runnable = Runnable{
            block()
        }

        runnable.run()
    }

    inline fun runRunnable2(crossinline block:()->Unit) {
        val runnable = Runnable{
            block()
        }
        runnable.run()
    }
}