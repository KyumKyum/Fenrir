package com.bifrost.core

import com.bifrost.exception.RequiredDirCreationException
import io.ktor.utils.io.errors.*

//* TODO: Replace println in logger

class Bifrost {

    companion object {
        private val _core: BifrostCore = BifrostCore()

        fun bootstrap() {
            try{
                println("✨ Bootstrapping Bifrost Client... ✨")
                this._core.initialize()
                this._core.checkConnection()
                println("\uD83D\uDE80 Bifrost Client Bootstrapped!! \uD83D\uDE80")
            }catch (err: IOException){
                println("ERROR: Exception occured while Bootstrapping Bifrost... (Creating required dir failed.)")
            }catch (err: SecurityException){
                println("Security Exception Occurs")
            }
        }
    }
}