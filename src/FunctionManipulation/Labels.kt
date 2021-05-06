package FunctionManipulation

fun printloop() {
    outerloop@ for(i in 1.. 10) {
        println(i)
       innerloop@ for(j in 1.. 300) {
           if ( j == 4) break@innerloop
        }
    }
}

fun main() {
    printloop()
}