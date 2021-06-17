package com.x5s.barterTradeApp.data.model.signUp

/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an in-memory cache of login status and user credentials information.
 */

class SignUpRepository(val dataSource: SignUpDataSource) {

    // in-memory cache of the loggedInUser object
    var user: SignUpUser? = null
        private set

    val isSignedUp: Boolean
        get() = user != null

    init {
        // If user credentials will be cached in local storage, it is recommended it be encrypted
        // @see https://developer.android.com/training/articles/keystore
        user = null
    }

    /*fun logout() {
        user = null
        dataSource.logout()
    }*/

    fun signUp(username: String, password: String): Result<SignUpUser> {
        // handle signUp
        val result = dataSource.signUp(username, password)

        if (result is Result.Success) {
            setSignedUpUser(result.data)
        }

        return result
    }

    private fun setSignedUpUser(signUpUser: SignUpUser) {
        this.user = signUpUser
        // If user credentials will be cached in local storage, it is recommended it be encrypted
        // @see https://developer.android.com/training/articles/keystore
    }
}