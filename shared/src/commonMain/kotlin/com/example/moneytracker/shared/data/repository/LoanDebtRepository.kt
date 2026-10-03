package com.example.moneytracker.shared.data.repository

import com.example.moneytracker.shared.data.model.LoanDebt
import com.example.moneytracker.shared.data.model.LoanDebtType
import com.example.moneytracker.shared.data.model.LoanDebtWithRepayments
import com.example.moneytracker.shared.data.model.Repayment
import kotlinx.coroutines.flow.Flow

interface LoanDebtRepository {
    fun getAllLoansDebtsFlow(): Flow<List<LoanDebtWithRepayments>>
    fun getLoansDebtsWithTypeFlow(type: LoanDebtType): Flow<List<LoanDebtWithRepayments>>
    fun getLoanDebtByIdFlow(id: Long): Flow<LoanDebtWithRepayments?>
    suspend fun insertLoanDebt(loanDebt: LoanDebt): Long
    suspend fun updateLoanDebt(loanDebt: LoanDebt)
    suspend fun deleteLoanDebt(loanDebt: LoanDebt)
    suspend fun deleteAllLoansDebts()
    suspend fun addRepayment(loanDebtId: Long, amount: Double, date: Long, note: String?): Boolean
    suspend fun deleteRepayment(repayment: Repayment)
}
