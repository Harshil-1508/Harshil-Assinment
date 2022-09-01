package Assinment_Filehendling

import java.io.File

fun main() {
    // content to be appended to file
    var content:String = " This is additional content added to the File."

    // using extension function appendText
    File("student.txt").appendText(content)

    println("append operator called")
}