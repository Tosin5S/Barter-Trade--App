package com.x5s.barterTradeApp.data.model.signUp

/**
 * Data class that captures user information for logged in users retrieved from SignUpRepository
 */
data class SignUpUser(
        val userId: String,
        val displayName: String
)