package KotlinBasics

import java.util.*

fun main(args: Array<String>) {
    feedTheFish()
}

fun feedTheFish() {
    var day : String = getDayofWeek()
    var food : String = getFoodofWeek(day)
    println("on Day $day Fish will eat $food")
}

fun getFoodofWeek(day: String) : String {
    val food : Array<String> = arrayOf("Pawbhaji", "Samosa",
            "chicken Biryani", "roti", "Rice", "Butter")
    return when(day) {
        "Monday" -> food[0]
        "Tuesday" -> food[1]
        "Wednesday" -> food[2]
        "Thirsday" -> food[3]
        "Friday" -> food[4]
        "Saturday" -> food[5]
        else -> "nothing"
    }
}

fun getDayofWeek() : String {
    val Day : Array<String> = arrayOf("Monday", "Tuesday", "Wednesday",
            "Thirsday", "Friday", "Saturday")
    return Day[Random().nextInt(Day.size)]
}
