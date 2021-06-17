package com.x5s.barterTradeApp.data.model.signUp

import java.io.IOException
import java.util.*

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class SignUpDataSource {

    fun signUp(username: String, password: String): Result<SignUpUser> {
        try {
            // TODO: handle loggedInUser authentication
            val fakeUser = SignUpUser(UUID.randomUUID().toString(), "Jane Doe")
            return Result.Success(fakeUser)
        } catch (e: Throwable) {
            return Result.Error(IOException("Error signing up", e))
        }
    }

   /* fun signOut() {
        // TODO: revoke authentication
    }*/
}