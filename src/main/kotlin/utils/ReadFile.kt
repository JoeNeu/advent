package utils

import java.io.File

object ReadFile {
    fun readFileAsLinesUsingReadLines(fileName: String): List<String>
            = File(fileName).readLines()
}
