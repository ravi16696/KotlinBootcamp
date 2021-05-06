package extensions

fun main() {
    val pair1 = 1 to "Ravi"
    val pair2 = 2 to "Anu"
    println("pair1 ${pair1.first} corrosponds to ${pair1.second}")
    var (a,b) = pair1
    println("$a  " + b)
    val triple1 = Triple(1,2,3)
    println(pair2.toString())
    println(pair2.toList())
    println(triple1.toString())
    println(triple1.toList())

    val listOfPair = listOf(1 to "ravi", 2 to "anu", "shreya" to "shweta")
    println(listOfPair.toString())
}