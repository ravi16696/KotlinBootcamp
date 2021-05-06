package KotlinClasses

import javax.xml.crypto.Data

data class DataClass(var color : String) {
    fun printColor() {
        println(color)
    }
}

fun main() {
    initializeDataClass()
}

fun initializeDataClass() {
    var dataClass = DataClass("Red")
    var dataClass1 = DataClass("Blue")
    var dataClass2 = DataClass("Blue")
    println(dataClass)
    println(dataClass1)
    println(dataClass2)
    println(dataClass.equals(dataClass1))
    println(dataClass2==(dataClass1))
    //dataClass.printColor()
    val (color1) = dataClass
    println(color1)
}
