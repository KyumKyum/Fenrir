package com.bifrost.core.manager

import com.bifrost.constants.StorageDir
import java.io.File
import java.nio.file.Files

class DirectoryManager {
    companion object{
        fun checkAndCreateDir(){
            StorageDir.requiredDir.forEach{ path ->
                val cwd = System.getProperty("user.dir")
                val dir = File("$cwd$path")

                if (!dir.exists() && !dir.isDirectory) {
                    //* Create required dir
                    Files.createDirectories(dir.toPath())
                }
            }
        }
    }
}