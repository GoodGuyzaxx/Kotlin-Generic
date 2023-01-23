package app

import data.MyData

fun main() {
    val myDataString: MyData<String,Int> = MyData("zaxx",100)
    myDataString.printlnDta()


    val myDataInt: MyData<Int, String> = MyData(100, "zaxx")
    myDataInt.printlnDta()
}