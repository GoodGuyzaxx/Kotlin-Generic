package app

interface canSayHello {
    fun sayHello(name: String){
    }

}

open class Employee

class Manager : Employee()

class VicePresident : Employee(), canSayHello{
    override fun sayHello(name: String) {
        println("Hi Manager $name")
    }
}

class Company<T>(val employee: T) where T : Employee, T: canSayHello

fun main(){
    //val data1 = Company(Employee())
    //val data2 = Company(Manager())
    val data3 = Company(VicePresident())
}