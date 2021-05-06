package extensions

object constClass {
    const val TEMP = "this is a constant"
    fun printmethod() {
        println(TEMP)
    }
}

class temporary {
    val temp = "ravi"
    companion object {
        private const val TEMPCONST = "Address is - "

        fun getAddress() : String {
            return TEMPCONST + "Bengalure"
        }
    }
    open fun printmethod() {
        getAddress()
        println(TEMPCONST)
    }
}
fun main() {
    println(temporary.getAddress())
}