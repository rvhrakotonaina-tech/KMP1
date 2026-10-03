package com.example.moneytracker.shared.data.model

import kotlinx.serialization.Serializable

@Serializable
enum class TransactionType {
    INCOME, EXPENSE
}

@Serializable
data class Transaction(
    val id: Long = 0,
    val amount: Double,
    val type: TransactionType,
    val category: String,
    val date: Long,
    val note: String
)
