package utils

import java.io.File

object FileReader {
    fun asLines(fileName: String): List<String>
            = File(fileName).readLines()

    fun asText(fileName: String): String
            = File(fileName).bufferedReader().use { it.readText() }
}
