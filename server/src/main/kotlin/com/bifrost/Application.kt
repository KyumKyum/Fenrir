package com.bifrost

import com.bifrost.src.plugins.configureHTTP
import com.bifrost.src.plugins.configureMonitoring
import com.bifrost.src.controller.configureRouting
import com.bifrost.src.plugins.configureSerialization
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    Banner.printBanner()
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureHTTP()
    configureSerialization()
    configureMonitoring()
    //configureDatabases() //* TODO Kafka setting
    configureRouting()
}
