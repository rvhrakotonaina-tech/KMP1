package com.example.moneytracker.shared.data.repository

import com.example.moneytracker.shared.data.model.Transaction
import com.example.moneytracker.shared.data.model.TransactionType
import kotlinx.coroutines.flow.Flow

interface TransactionRepository {
    fun getAllTransactions(): Flow<List<Transaction>>
    suspend fun getTransactionsPaged(page: Int, pageSize: Int): List<Transaction>
    fun getTransactionsFilteredPagedFlow(
        noteQuery: String?,
        type: TransactionType?,
        category: String?,
        startDate: Long?,
        endDate: Long?,
        page: Int,
        pageSize: Int
    ): Flow<List<Transaction>>
    fun getTransactionsCountFlow(
        noteQuery: String?,
        type: TransactionType?,
        category: String?,
        startDate: Long?,
        endDate: Long?
    ): Flow<Int>
    fun getCategories(): Flow<List<String>>
    suspend fun insertTransaction(transaction: Transaction)
    suspend fun updateTransaction(transaction: Transaction)
    suspend fun deleteTransaction(transaction: Transaction)
    suspend fun deleteAllTransactions()
    fun getTransactionByIdFlow(id: Long): Flow<Transaction?>
    suspend fun getTransactionById(id: Long): Transaction?
}
