package core

import jdk.nashorn.internal.runtime.Context.getContext
import java.io.*
import java.nio.file.Paths
import java.util.*


fun main() {
    //on a desktop system
    //get current file path (first method)
    val path1 = System.getProperty("user.dir")
    println("Working Directory = $path1")

    //get current file path (second method)
    val path2 = Paths.get("").toAbsolutePath().toString()
    println("Working Directory = $path2")

    //get document path
    val fr = javax.swing.JFileChooser()
    val fw = fr.fileSystemView
    val documentsPath = fw.defaultDirectory.toString()
    println(documentsPath)

    //on android activity
    val path = this.getAplicationInfo().dataDir

    //on android fragment
    val path4 = getContext().getApplicationInfo().dataDir
}



