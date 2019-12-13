package com.lsm.userHub

import java.util.*
import io.ktor.http.*
import io.ktor.client.*
import io.ktor.swagger.experimental.*

interface LSMHubClient : LSMHub {
    fun setToken(token: String)
}

fun LSMHubClient(endpoint: String, client: HttpClient = HttpClient()): LSMHubClient = createClient(client, endpoint)
