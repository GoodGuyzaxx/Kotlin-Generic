package data

class Fucntion(val name: String) {

    fun <T>sayHello(param: T){
        println("Hi code Name $param, my name is ${this.name}")
    }
}