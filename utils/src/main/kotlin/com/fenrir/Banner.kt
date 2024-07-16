package com.bifrost

import java.io.File


class Banner {
    companion object {
        fun printBanner(): Unit {
            print("\u001b[2J") // Clear the entire screen
            print("\u001b[0;0H") // Move the cursor to the top left corner
            val cwd = System.getProperty("user.dir")
            File("${cwd}/../utils/assets/banner.txt").forEachLine {
                println(it)
            }
        }
    }
}