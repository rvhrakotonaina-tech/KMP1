package com.example.moneytracker.shared.data.model

import kotlinx.serialization.Serializable

@Serializable
enum class LoanDebtType {
    LOAN,
    DEBT
}

@Serializable
enum class LoanDebtStatus {
    PENDING,
    PAID,
    REPAID
}

@Serializable
data class LoanDebt(
    val id: Long = 0,
    val type: LoanDebtType,
    val person: String,
    val originalAmount: Double,
    val remainingAmount: Double,
    val date: Long,
    val dueDate: Long? = null,
    val note: String? = null,
    val status: LoanDebtStatus = LoanDebtStatus.PENDING
)

@Serializable
data class Repayment(
    val id: Long = 0,
    val loanDebtId: Long,
    val amount: Double,
    val date: Long,
    val note: String? = null
)

@Serializable
data class LoanDebtWithRepayments(
    val loanDebt: LoanDebt,
    val repayments: List<Repayment>
)
