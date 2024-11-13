package io.olkkani.other.api.lostark

@kotlinx.serialization.Serializable
data class MarketItem(
    val Id: Long,
    val Name: String,
    val Grade: String,
    val TradeRemainCount: Int?,
    val RecentPrice: Int,
    val CurrentMinPrice: Int,
    val YDayAvgPrice: Int,
    val TimeTypeCode: String?
)

@kotlinx.serialization.Serializable
data class MarketResponse(
    val PageNo: Int,
    val PageSize: Int,
    val TotalCount: Int,
    val Items: List<MarketItem>
)

@kotlinx.serialization.Serializable
data class MarketRequest(
    val CategoryCode: Int,
    val ItemCode: String,
    val Sort: String = "RECENT_PRICE",
    val SortCondition: String = "DESC",
    val PageNo: Int = 1,
    val PageSize: Int = 10
)