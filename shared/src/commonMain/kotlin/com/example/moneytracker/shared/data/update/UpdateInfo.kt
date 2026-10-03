package com.example.moneytracker.shared.data.update

import kotlinx.serialization.Serializable

@Serializable
data class UpdateInfo(
    val versionCode: Int = 0,
    val versionName: String = "",
    val downloadUrl: String = "",
    val releaseNotes: List<String> = emptyList()
)
