package KotlinClasses

interface interMethod {
    fun eat()
    fun print() {
        println("printing in interface")
    }
}

interface interMehod1 {
    fun eat1()
}

abstract class AbstractClass{
    abstract var color : String
}

class child1 : AbstractClass(), interMethod, interMehod1{
    override var color = "red"
    override fun eat() {
        println("child1 interface")
    }

    override fun eat1() {
        TODO("Not yet implemented")
    }
}

class child2 : AbstractClass(), interMethod {
    override var color = "Blue"
    override fun eat() {
       println("child2 interface")
    }
}

fun main() {
    createObjectClass()
}

fun createObjectClass() {
    var childClass = child1()
    println(childClass.color)
    childClass.eat()
    var childClass1 = child2()
    println(childClass1.color)
    childClass1.eat()
}
