package Assinment_Filehendling

import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream


fun main() {



    var file = File("D:\\kotlin\\file_handling\\student.txt",)
    writeData(file)

}


fun writeData(file: File) {

    try {
        println("enter message : ")
        var message = readLine()
        var fout = FileOutputStream(file,true)
        fout.write(message!!.toByteArray())
        fout.close()

    }catch (e:Exception){
        e.printStackTrace()
    }
}
