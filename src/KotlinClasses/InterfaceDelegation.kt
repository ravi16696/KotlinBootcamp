package KotlinClasses

interface Interface1 {
    var name : String
}
object Name : Interface1 {
    override var name = "Ravi"
}
interface Interface2 {
    fun HowAreYou()
}
class howAreYou(var message : String) : Interface2 {
    override fun HowAreYou() {
       println(message)
    }
}

class Student : Interface1 by Name, Interface2 by howAreYou("i am not good") {
}

fun main() {
    var student = Student()
    println(student.name)
    student.HowAreYou()
}