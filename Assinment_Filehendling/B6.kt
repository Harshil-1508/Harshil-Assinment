package Assinment_Filehendling


import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.nio.file.StandardCopyOption

private fun copyFile(src: File, dest: File) {
    Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING)
}

fun main() {
    val from = File("student.txt")
    val to = File("Student.txt")
    try {
        copyFile(from, to)
        println("File copied successfully.")
    } catch (ex: IOException) {
        ex.printStackTrace()
    }
}