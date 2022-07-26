package assinment

fun main() {
    println("enter the natural value  :")
    var num1 = readLine()!!.toInt()
    println("num1 : $num1")

    println("enter the natural value  :")
    var num2 = readLine()!!.toInt()
    println("num : $num2")

    if (num1>0 && num2>0){
        print("Addition of two natural number of : ${num1+num2}")
    }
    else{
        println("enter the valid number ")
    }
}