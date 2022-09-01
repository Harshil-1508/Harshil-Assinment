package Assinment_Filehendling

import java.io.File

fun main(args: Array<String>) {
    var fileA = File("D:\\kotlin\\file_handling\\student.txt")
    fileA.deleteRecursively()
}