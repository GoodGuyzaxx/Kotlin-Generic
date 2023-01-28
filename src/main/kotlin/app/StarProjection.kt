package app

fun displayLength(array: Array<*>){
    println("Length arry ${array.size}")
}

fun main() {
    val arrayInt: Array<Int> = arrayOf(1,2,3,4,5,6)
    val arrayString: Array<String> = arrayOf("zax","jaki","wahyudi")

    displayLength(arrayInt)
    displayLength(arrayString)
}