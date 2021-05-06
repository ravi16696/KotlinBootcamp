package KotlinClasses

open class Constructors(open var length : Int, var breadth : Int = 20, var height : Int = 20) {
    var volume  = 30
        get() {
            println("inside getter")
            return 50
        }
        private set(value) {
            println("inside setter for volume")
            field = value
        }

    init {
        println("initilising Constructors")
    }

    constructor(numberOfFish : Int) : this(length = 20) {
        println("initilising secondry constructor")
        var temp = (length * breadth * height / 2).toInt()
    }
    fun printDimension() {
        println("length : ${length} " +
                "breadth : ${breadth} " +
                "height : ${height} ")

        println("volume : $volume")
    }
}

class ChildClass(var area : Int, override var length: Int = 200) : Constructors(20) {
    init {
        area = 30
    }
    var childLength = 10

//    override fun printDimension() {
//        var constructors = Constructors(10)
//        constructors.printDimension()
//        println("area : $area")
//        println("childLength $childLength")
//    }
}

fun main() {
//    var constructors = Constructors(length = 30)
//    constructors.printDimension()
//    var constructors1 = Constructors(30)
//    constructors1.printDimension()
    var childClass = ChildClass(20)
    childClass.printDimension();
    println("parentVolume ${childClass.volume}")
}

