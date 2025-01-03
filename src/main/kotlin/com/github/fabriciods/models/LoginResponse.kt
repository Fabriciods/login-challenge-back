package com.github.fabriciods.models

import kotlinx.serialization.Serializable

@Serializable
data class LoginResponse(
    val userName: String,
)
