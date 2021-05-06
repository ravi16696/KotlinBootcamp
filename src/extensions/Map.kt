package extensions

fun main() {
    val map1 = mutableMapOf(1 to "ravi", 2 to "Anu", 3 to "Arsh")
    println(map1.entries)
    println(map1.get(2))
    println(map1[5])
    println(map1.getOrDefault(5,"value not available"))
    println(map1.getOrElse(5) {var a = 2
    var b =5
    var c = a + b
    "raj"})
    map1.put(6, "adsfa")
    map1[9] = "wfas"
}