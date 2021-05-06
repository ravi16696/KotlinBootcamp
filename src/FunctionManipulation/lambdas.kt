package FunctionManipulation

import java.util.*

val temp = {value : Int -> value/2}

class Fish(val fish : String) {

}

var fishList = listOf(Fish("bihar"), Fish("kolkata"), Fish("bengali"))

fun main() {
    println(temp(20))
    val list = fishList.filter { it.fish.contains('i') }
    println(list)
    list.joinToString(", "){ it.fish }
    println(list.toString())
}
