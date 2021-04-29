package core

import java.io.*
import java.nio.file.Files
import java.nio.file.attribute.BasicFileAttributes
import java.util.*


fun main() {
    val file = File("file.txt")

    //file size
    val fileSize = file.length()

    //file modification date
    val dateChanges = Date(file.lastModified())

    //file creation date
    val attr = Files.readAttributes(
            file.toPath(), BasicFileAttributes::class.java)
    val creationDate = attr.creationTime()

    //is readable file
    val isReadable = file.canRead()

    //is writable file
    val isWritable = file.canWrite()

    //id hidden file
    val isHidden = file.isHidden

    //file extension
    val extension = file.extension

    //file directory
    val fileDir = file.absoluteFile.getParent()
}



