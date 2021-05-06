package extensions

fun main() {
    var list = mutableListOf(1,2,45,3,4,5,6,8,10,12)
    println(list.size)
    println(list.count())
    println(list.size)
    println(list.sum())
    println(list.sumBy {  it*2 })
    println(list.contains(3))
    list.add(24)
    list.reverse()
    list.sortByDescending { it }
    println(list.toString())
    println(list.reversed())
    for(it in list.listIterator()) {
        println("inside the loop")
        if(it % 2 == 0) {
            println(it)
        }
    }
}
