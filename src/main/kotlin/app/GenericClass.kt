package app

import data.MyData

fun main() {
    val myDataFirst: MyData<String,Int> = MyData("zaxx",100)
    myDataFirst.printlnDta()


    val myDataSecond: MyData<Int, Char> = MyData(100,'A')
    myDataSecond.printlnDta()

}