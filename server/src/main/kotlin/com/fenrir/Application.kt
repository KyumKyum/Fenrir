package com.fenrir

import com.fenrir.src.plugins.configureHTTP
import com.fenrir.src.plugins.configureMonitoring
import com.fenrir.src.controller.configureRouting
import com.fenrir.src.plugins.configureSerialization
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
