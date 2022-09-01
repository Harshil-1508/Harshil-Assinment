package Assinment_Filehendling

import java.io.File


// Main class
object GFG {
    fun main(args: Array<String>) {
        val f = File("D:\\kotlin\\file_handling\\student.txt")

        if (f.exists()) {
            println("Exists")

        }
        else  {
            println("Does not Exists")

        }
    }
}
