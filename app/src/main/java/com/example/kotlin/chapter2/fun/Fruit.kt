package com.example.kotlin.chapter2.`fun`

/**
 * Lambda的表达式语法结构
 * {参数名：参数类型 ， 参数名：参数类型 -> 函数体}
 */
class Fruit {

    val list = listOf<String>("origin", "pear", "banana", "orange", "watermelon")
    var maxLengthFruit = ""

    fun maxLengthFruitFilter(): String {
        for (fruit in list) {
            if (fruit.length > maxLengthFruit.length) {
                maxLengthFruit = fruit.length.toString()
            }
        }
        return maxLengthFruit
    }


    val lambda = { fruit: String -> fruit.length }
    //演练
    val maxLengthFilter4 = list.maxByOrNull({ fruit: String -> fruit.length })
    //1.当Lambda参数是函数的最后一个参数时，可以将lambda表达式放到函数括号外
    val maxLengthFilter5 = list.maxByOrNull(){fruit:String->fruit.length}
    //2.当Lambda参数是函数的唯一参数，可以将函数的括号省略
    val maxLengthFilter6 = list.maxByOrNull{fruit:String->fruit.length}
    //3.Lambda表达式的参数列表只有一个参数时，不必声明参数名，用it关键字代替
    val maxLengthFilter7 = list.maxByOrNull { it.length }

    //创建匿名类的实例用object关键字
    fun javaLambda() {
        Thread(object : Runnable{
            override fun run() {
                TODO("Not yet implemented")
            }

        }).start()

        Thread(Runnable {

        }).start()
    }




}