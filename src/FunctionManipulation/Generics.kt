package FunctionManipulation

import kotlin.reflect.full.declaredMemberFunctions

//creating annotation

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet
@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet


@IamPlant class Plant {
    @get: OnGet
    val isGrowing = false

    @set: OnSet
    var needsFood = true

    fun trim() {}
    fun fertilize() {
    }
}

fun printFunction() {
    val classObj = Plant::class
    for (m in classObj.declaredMemberFunctions) {
        println(m.name)
    }
}
fun testAnnotation() {
    val classObj = Plant::class
    for (m in classObj.annotations) {
        println(m.annotationClass.simpleName)
    }
}

fun main() {
    testAnnotation()
}

//now creating annotation

annotation class IamPlant {

}
