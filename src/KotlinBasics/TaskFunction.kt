package KotlinBasics

fun main(args : Array<String>) {
    swim()
    swim("slow")
    swim(speed = "very slow")
    println(shouldChangeWater("Monda", temp = 60))
}

fun swim(speed : String = "fast") {
    println("swimming speed of fish is $speed")
}

fun shouldChangeWater (day : String, temp : Int = 21, dirty : Int = 34 ) : Boolean {
    return when {
        isHot(temp) -> {
            println("Temperatur is $temp ")
            return false
        }
        isDirty(dirty) -> true
        isMonday(day) -> true
        else -> false
    }
}

fun isHot(temp: Int) = temp > 30
fun isDirty(dirty: Int) = dirty > 40
fun isMonday(day: String) = day == "Monday"

