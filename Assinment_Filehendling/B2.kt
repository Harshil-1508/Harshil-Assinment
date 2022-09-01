package Assinment_Filehendling

import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream


fun main() {


    var file = File("D:\\kotlin\\file_handling\\student.txt",)

    readData(file)

}

fun readData(file: File) {
    try {
        var fin = FileInputStream(file)

        var byteArray = ByteArray(fin.available())
        fin.read(byteArray)

        var message = String(byteArray)
        println("$message")

        fin.close()

        println("size : ${fin.available()}")

    }catch (e : Exception){
        e.printStackTrace()
    }

}




