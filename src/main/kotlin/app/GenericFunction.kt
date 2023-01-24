package app
import data.Fucntion

fun main() {
    val sayZaxx = Fucntion("zaxx")

    sayZaxx.sayHello("Rock")
    sayZaxx.sayHello<String>("Rock")


    sayZaxx.sayHello(10011)
    sayZaxx.sayHello<Int>(10011)
}