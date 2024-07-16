package com.bifrost.core

import io.ktor.client.*
import io.ktor.client.engine.cio.*

class Bifrost private constructor(){
    companion object {
        private var _client: HttpClient? = null

        fun getClient(): HttpClient {
            return this._client ?: synchronized(this) {
                val client = HttpClient(CIO)
                this._client = client
                return client
            }
        }
    }
}