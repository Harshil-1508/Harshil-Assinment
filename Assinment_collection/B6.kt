package Assinment_collection

import java.util.*

fun main() {

    val array = arrayOf("a", "b", "c")
    val set = HashSet(Arrays.asList(*array))

    println("Set: $set")

}