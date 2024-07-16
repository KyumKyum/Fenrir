package com.bifrost.api

import io.ktor.client.*
import io.ktor.client.engine.cio.*

class BifrostApiClient private constructor(){
    companion object {
        private var _client: HttpClient? = null

        fun getClient(): HttpClient {
            return _client ?: synchronized(this) {
                val client = HttpClient(CIO)
                _client = client
                return client
            }
        }
    }
}