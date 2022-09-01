package Assinment_classandobject

data class child(val name: String, val age: Int)
{
    var height: Int = 0;
}

fun main(args: Array<String>)
{


    val c1 = child("manish",18)

    val c2 = c1.copy(name="rahul")

    val c3 = c1.copy()


    c1.height=100
    c2.height=90
    c3.height=110


    println("${c1} has ${c1.height} cm height")
    println("${c2} has ${c2.height} cm height")
    println("${c3} has ${c3.height} cm height")

}