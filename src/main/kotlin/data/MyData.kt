package data

class MyData<T, U>(val firstData: T, val secondData : U) {

    fun printlnDta(){
        return println("ini data 1$firstData, ini data 2 $secondData")
    }
    fun getFirstData1(): T {
        return firstData;
    }

    fun getSecondData1(): U {
        return secondData
    }
}