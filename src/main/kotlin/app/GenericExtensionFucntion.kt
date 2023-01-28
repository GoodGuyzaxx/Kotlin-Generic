package app

class Data<T>(val Data : T)

fun Data<String>.print(){
    val data: String = this.Data
    println(data)
}

fun Data<Int>.prtinInt(){
    val data: Int = this.Data
    println(data)
}

fun main() {
    val data1 = Data(1)
    val data2 = Data("zax")

    data1.prtinInt()
    data2.print()
}