package KotlinBasics

fun main(args : Array<String>) {
    var temp = 20
    println(function(temp))
    println(function1(30))
}

var function = {temp : Int -> temp/2}
var function1 : (Int) -> Int = { temp -> temp * 2}