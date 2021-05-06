package FunctionManipulation

data class Fish1(var name : String)

fun fishExample() {
    val fish = Fish1("splashy")
    with(fish.name) {
        this.capitalize()
        println(this.capitalize())
    }
}

fun runExample() {
    val runnable = object: Runnable {
        override fun run() {
            println("I'm a Runnable")
        }
    }
   // JavaRun.runNow(runnable)
    JavaRun.runNow({
        println("i am a runnable")
    })
}

fun main() {
   // fishExample()
    runExample()
}