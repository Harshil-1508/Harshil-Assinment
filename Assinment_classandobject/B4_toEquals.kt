package Assinment_classandobject

fun main()
{
    data class student(val name: String, val age: Int)


    val h1 = student("manish",18)
    val h2 = h1.copy(name="rahul")
    val h3 = h1.copy();





    //checking equality of these hash codes
    println(" ${h1.equals(h2)}")
    println(" ${h2.equals(h3)}")
    println(" ${h1.equals(h3)}")

}






