package io.olkkani.other.api.lostark

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

class MarketClient(private val apiKey: String) {
    private val baseUrl = "https://developer-lostark.game.onstove.com"

    private val client = HttpClient(CIO) {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                prettyPrint = true
            })
        }
    }

    suspend fun getMarketItems(
        itemCode: String,
        categoryCode: Int = 210000,
        pageNo: Int = 1,
        pageSize: Int = 10
    ): MarketResponse {
        val request = MarketRequest(
            CategoryCode = categoryCode,
            ItemCode = itemCode,
            PageNo = pageNo,
            PageSize = pageSize
        )

        val response = client.post("$baseUrl/auctions/items") {
            contentType(ContentType.Application.Json)
            header("authorization", "bearer $apiKey")
            setBody(request)
        }
        return response.body()
    }

    fun close() {
        client.close()
    }
}

// Main.kt