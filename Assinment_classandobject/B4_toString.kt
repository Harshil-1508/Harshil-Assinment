package Assinment_classandobject

data class man(val roll: Int,val name: String,val height:Int)

fun main(args: Array<String>)
{

    val m1=man(1,"man",50)

    println(m1.toString());
}