package data

class MyData<T, U>(val firstDala: T , val secondData : U) {
    fun printlnDta(){
        return println("ini data 1$firstDala, ini data 2 $secondData")
    }

    fun getData(): T {
        return firstDala;
    }
}