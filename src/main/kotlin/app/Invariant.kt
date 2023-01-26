package app

class Invariant<T>(val data: T)

fun main() {
    val data1: Invariant<String> = Invariant("zaxx")
    //val data2: Invariant<String> = data1
}