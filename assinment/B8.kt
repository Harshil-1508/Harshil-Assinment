package assinment

fun main() {

    var first = 20
    var second = 10

    println("------Before Swapping------")
    println("First Value : $first")
    println("Second Value : $second")

    var temp = first
    first = second
    second = temp

    println("------After Swapping------")
    println("First Value : $first")
    println("Second Value : $second")
}