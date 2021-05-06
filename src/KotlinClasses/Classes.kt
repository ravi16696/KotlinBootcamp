package KotlinClasses

class Aquarium {
    var length : Int = 20
    var breadth : Int = 30
    var height : Int = 30

    fun getVolume() : Int {
        return length * breadth * height
    }

    fun buildAquarium() {
        println("length : ${length} " +
                "breadth : ${breadth} " +
                "height : ${height} ")
    }
}


fun main() {
    var aquarium = Aquarium()
    aquarium.length = 30
    aquarium.buildAquarium()
    println(aquarium.getVolume())
}