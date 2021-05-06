package extensions

class test(var color : String, private var tempVal : Int ) {}
fun test.isRed() : Boolean {
    if (color == "red") {
        return true
    }
    return false
}
fun String.hasSpace() : Boolean {
    val found = this.find { it == ' ' }
    return found!= null
}

fun test?.pull() {
    this?.apply {
        println("indie pull")
    }
}
fun main() {
    println("asdb  d".hasSpace())
    println(test("red", 5).isRed())
    val temp : test? = test("red", 8)
    temp.pull()
}