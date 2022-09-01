package Assinment_Filehendling

import java.io.File


fun main() {

    // using extension function walk
    File("D:\\kotlin\\file_handling\\student.txt").walk().forEach {
        println(it)
    }
}