package io.olkkani.other.api.lostark

import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val apiKey = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6IktYMk40TkRDSTJ5NTA5NWpjTWk5TllqY2lyZyIsImtpZCI6IktYMk40TkRDSTJ5NTA5NWpjTWk5TllqY2lyZyJ9.eyJpc3MiOiJodHRwczovL2x1ZHkuZ2FtZS5vbnN0b3ZlLmNvbSIsImF1ZCI6Imh0dHBzOi8vbHVkeS5nYW1lLm9uc3RvdmUuY29tL3Jlc291cmNlcyIsImNsaWVudF9pZCI6IjEwMDAwMDAwMDAwNjU1NTIifQ.jETZnd9myHKT8mWNfzF_8G6wwho4Vpf3ajqbTtSA-CYr5crd-6PA5eRZPbWc39xCXFtYr4OGWViJ18zB_MrHg7Ml2VkSDQ16I_sXqb5gPc4EVtrkat55uY8tX3uEzkL_WiT6cbeojWq7P-JO5yxPwX64L7B3PBHM58fBU-d3GghPpv1ffj59nlW3mGUlrNS9jdu5w9RDiBW8R-0fg-bxK09dpB7reX3SY4Q0gDYQCz1NGMNg_DQ1EHlsKWwe0Vff3ntDGX9PaY6_Lxqv3O3wQVX0xg26gzrGqoz53yH3Vg1Z_zoCPB_GZjlzo2mIwv-Kk57CnrzqadIAewu7f_IuVg" // 실제 API 키로 교체 필요
    val client = MarketClient(apiKey)

    try {
        // 65031100 코드를 가진 보석 조회
        val result = client.getMarketItems(itemCode = "65021100")

        println("==== 거래소 검색 결과 ====")
        println("총 ${result.Items.size}개의 아이템이 검색되었습니다.")

        result.Items.forEach { item ->
            println("""
                아이템명: ${item.Name}
                등급: ${item.Grade}
                최근 거래가: ${item.RecentPrice}
                현재 최저가: ${item.CurrentMinPrice}
                전일 평균가: ${item.YDayAvgPrice}
                거래 가능 횟수: ${item.TradeRemainCount}
                ----------------------
            """.trimIndent())
        }
    } catch (e: Exception) {
        println("API 호출 중 오류 발생: ${e.message}")
        e.printStackTrace() // 상세한 에러 정보를 보기 위해 추가
    } finally {
        client.close()
    }
}