package app

interface canSayHello{
    fun sayHello(name: String){
    }

}

open class Employee

class Manager : Employee()

class VicePresident : Employee()

class Company<T : Employee>(val employee: T)

fun main(){
    val data1 = Company(Employee())
    val data2 = Company(Manager())
    val data3 = Company(VicePresident())
}