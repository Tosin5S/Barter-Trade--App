package com.x5s.barterTradeApp.ui.signUp

/**
 * Data validation state of the login form.
 */
data class SignUpFormState(val usernameError: Int? = null,
                           val passwordError: Int? = null,
                           val isDataValid: Boolean = false)