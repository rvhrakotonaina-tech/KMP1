package com.example.moneytracker.shared.data.ai

interface AIService {
    suspend fun getChatResponse(prompt: String): String?
}
