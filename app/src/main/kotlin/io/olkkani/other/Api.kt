package io.olkkani.other
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

class LostArkMarketClient(private val apiKey: String) {
    private val client = HttpClient(CIO) {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                prettyPrint = true
                isLenient = true
            })
        }
        install(Logging) {
            level = LogLevel.ALL
        }
        // 타임아웃 설정 추가
        install(io.ktor.client.plugins.HttpTimeout) {
            requestTimeoutMillis = 60000
            connectTimeoutMillis = 60000
        }
    }

    suspend fun getItemMarketHistory(itemId: String): Result<String> {
        return try {
            // API 키 유효성 검사
            if (apiKey.isBlank()) {
                return Result.failure(Exception("API 키가 비어있습니다."))
            }

            val response: HttpResponse = client.get("https://developer-lostark.game.onstove.com/markets/items/$itemId") {
                headers {
                    // 표준 헤더 형식으로 변경
                    append(HttpHeaders.Authorization, "Bearer $apiKey")
                    append(HttpHeaders.Accept, ContentType.Application.Json.toString())
                    append(HttpHeaders.ContentType, ContentType.Application.Json.toString())
                }
            }

            when (response.status) {
                HttpStatusCode.Unauthorized -> {
                    println("인증 실패: API 키를 확인해주세요.")
                    println("사용된 API 키: ${apiKey.take(5)}...") // API 키의 처음 5자리만 출력
                    Result.failure(Exception("401 Unauthorized: API 키가 유효하지 않습니다."))
                }
                HttpStatusCode.OK -> {
                    val responseText = response.bodyAsText()
                    Result.success(responseText)
                }
                else -> {
                    val responseText = response.bodyAsText()
                    println("예상치 못한 응답 코드: ${response.status}")
                    println("응답 내용: $responseText")
                    Result.failure(Exception("API 요청 실패 - 상태 코드: ${response.status}, 응답: $responseText"))
                }
            }
        } catch (e: Exception) {
            println("API 호출 중 오류 발생: ${e.message}")
            e.printStackTrace()
            Result.failure(e)
        } finally {
            client.close()
        }
    }

    // API 키 유효성 검증을 위한 테스트 메서드
    suspend fun testApiKey(): Result<Boolean> {
        return try {
            val response = client.get("https://developer-lostark.game.onstove.com/markets/items/65031100") {
                headers {
                    append(HttpHeaders.Authorization, "Bearer $apiKey")
                    append(HttpHeaders.Accept, ContentType.Application.Json.toString())
                }
            }

            Result.success(response.status == HttpStatusCode.OK)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}

// 사용 예시
suspend fun main() {
    val apiKey = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6IktYMk40TkRDSTJ5NTA5NWpjTWk5TllqY2lyZyIsImtpZCI6IktYMk40TkRDSTJ5NTA5NWpjTWk5TllqY2lyZyJ9.eyJpc3MiOiJodHRwczovL2x1ZHkuZ2FtZS5vbnN0b3ZlLmNvbSIsImF1ZCI6Imh0dHBzOi8vbHVkeS5nYW1lLm9uc3RvdmUuY29tL3Jlc291cmNlcyIsImNsaWVudF9pZCI6IjEwMDAwMDAwMDAwNjU1NTIifQ.jETZnd9myHKT8mWNfzF_8G6wwho4Vpf3ajqbTtSA-CYr5crd-6PA5eRZPbWc39xCXFtYr4OGWViJ18zB_MrHg7Ml2VkSDQ16I_sXqb5gPc4EVtrkat55uY8tX3uEzkL_WiT6cbeojWq7P-JO5yxPwX64L7B3PBHM58fBU-d3GghPpv1ffj59nlW3mGUlrNS9jdu5w9RDiBW8R-0fg-bxK09dpB7reX3SY4Q0gDYQCz1NGMNg_DQ1EHlsKWwe0Vff3ntDGX9PaY6_Lxqv3O3wQVX0xg26gzrGqoz53yH3Vg1Z_zoCPB_GZjlzo2mIwv-Kk57CnrzqadIAewu7f_IuVg"  // 실제 API 키로 교체
    val client = LostArkMarketClient(apiKey)

    // 먼저 API 키 테스트
    client.testApiKey().fold(
        onSuccess = { isValid ->
            if (isValid) {
                println("API 키가 유효합니다. 데이터 조회를 시작합니다.")
                // API 키가 유효한 경우에만 실제 데이터 조회
                client.getItemMarketHistory("65021100").fold(
                    onSuccess = { responseText ->
                        println("API 호출 성공")
                        println("응답 내용: $responseText")
                    },
                    onFailure = { exception ->
                        println("API 호출 실패: ${exception.message}")
                    }
                )
            } else {
                println("API 키가 유효하지 않습니다. API 키를 확인해주세요.")
            }
        },
        onFailure = { exception ->
            println("API 키 테스트 중 오류 발생: ${exception.message}")
        }
    )
}