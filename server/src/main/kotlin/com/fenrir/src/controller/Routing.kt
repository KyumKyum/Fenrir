package com.fenrir.src.controller

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        route("/img") {
            post("/single"){

            }

            post("/bulk"){

            }
        }

        route("/pdf"){
            post("/single"){

            }

            post("/bulk"){

            }
        }

        route("/text"){
            post("/single"){

            }

            post("/bulk"){

            }
        }
    }
}
