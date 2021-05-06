package KotlinBasics

fun main(args : Array<String>) {
    val decoration : List<String> = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    val filtered = decoration.asSequence().filter { it[0] == 'p' }
    println("filtered  $filtered")
    val list = filtered.toList()
    println("sequence list  $list")
    val it = filtered.iterator()
    while (it.hasNext()) {
        val value = it.next()
        println("it $value")
    }
    println(decoration.filter { it == "rock"})
}