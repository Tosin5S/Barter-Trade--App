package com.x5s.barterTradeApp.ui.signUp

/**
 * Authentication result : success (user details) or error message.
 */
data class SignUpResult(
        val success: SignUpUserView? = null,
        val error: Int? = null
)