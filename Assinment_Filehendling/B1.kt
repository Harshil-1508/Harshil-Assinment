package Assinment_Filehendling

import java.io.File
fun main() {

    val filename = "student.txt"
    var file = File(filename)


    //create a file
    if (file.createNewFile()){
        println("file created successfully")
    }
    else{
        println("this file is already exits")
        println("this file is not found")
    }
}