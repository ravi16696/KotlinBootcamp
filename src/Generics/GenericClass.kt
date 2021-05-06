package Generics

open class waterSupply(var needProcessing : Boolean){
}

class TapWater : waterSupply(true) {
    fun addChecmicalCleaner() {
        println("add chemical cleaner")
        needProcessing = false;
    }
}

class FishWaterStore : waterSupply(false) {

}

class LakeWaterStore : waterSupply(true) {
    fun filter() {
        println("Filter water")
        needProcessing = false
    }
}

class Aquarimum<out T : waterSupply>(val watersupply : T) {
    fun addWater() {
        check(!watersupply.needProcessing) {
            println("water supply need processing first")
        }
        println("add water from ${watersupply.toString()}")
    }
}

fun genericExamplel() {
    val aquarimum = Aquarimum<TapWater>(TapWater())
    aquarimum.watersupply.addChecmicalCleaner()
    aquarimum.addWater()

    val aquarimum1 = Aquarimum<LakeWaterStore>(LakeWaterStore())
    aquarimum1.watersupply.filter()
    aquarimum1.addWater()

    val aquarimum2 = Aquarimum(FishWaterStore())
    val aquarimum3 = Aquarimum(waterSupply(false))
    addItemType(aquarimum2)

}

fun addItemType(parameter : Aquarimum<waterSupply>) {
    println("add item type")
}

fun main() {
    genericExamplel()
}