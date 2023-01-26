package app

class Contravariant<in T,>{
    fun sayHello(param: T){
        return println("hallo $param")
    }
}

fun main() {
    val data1: Contravariant<Any> = Contravariant()
    data1.sayHello(1)

    val data2: Contravariant<String> = data1
    data2.sayHello("P")
}