package com.bifrost.core

import com.bifrost.DirectoryManager


class BifrostCore() {
    fun initialize(){
        //* check if required directory exists.
        println("⚙\uFE0F Checking/Creating required directories... ⚙\uFE0F")
        DirectoryManager.checkAndCreateDir()
        println("\uD83D\uDCE6\uFE0F Finished! \uD83D\uDCE6\uFE0F")
    }

    fun checkConnection(){
        println("⚙\uFE0F Checking connection with Bifrost server... ⚙\uFE0F")
        //* TODO
        println("\uD83C\uDF1F Connection checked! \uD83C\uDF1F")
    }
}