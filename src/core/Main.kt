package core

import com.sun.org.apache.xalan.internal.xsltc.runtime.Node
import org.redundent.kotlin.xml.*
import java.io.*


//// dependencies{
//...
// implementation 'org.redundent: kotlin-xml-builder:1.5.0'
//}

fun main() {
    val file = File("data.xml")
    val doc = parse(file)
    for (node in doc.children) {
        if (node is Node) {
            val value = (node.children[0] as TextElement).text
            val id = node.attributes["Id"].toString()
            println("value: $valuem id: $id")
        }
    }

}



