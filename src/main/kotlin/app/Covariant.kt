package app
class Covariant<out T>(val data: T){
    fun out(): T{
        return data
    }
}

fun main() {
    val data: Covariant<String> = Covariant("zax")
    println(data.out())
}