package KotlinClasses

enum class EnumClass(var dir : String) {
    EAST("east"), WEST("west"), SOUTH("south") , NORTH("north")
}

fun main() {
    var enum1 = EnumClass.EAST.name
    var enum2 = EnumClass.NORTH.dir
    var enum3 = EnumClass.SOUTH.ordinal
    println(enum1 + enum2 + enum3)

}