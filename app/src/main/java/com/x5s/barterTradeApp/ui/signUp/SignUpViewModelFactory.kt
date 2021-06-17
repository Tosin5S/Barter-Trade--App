package com.x5s.barterTradeApp.ui.signUp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.x5s.barterTradeApp.data.model.login.LoginDataSource
import com.x5s.barterTradeApp.data.model.login.LoginRepository
import com.x5s.barterTradeApp.data.model.signUp.SignUpDataSource
import com.x5s.barterTradeApp.data.model.signUp.SignUpRepository

/**
 * ViewModel provider factory to instantiate SignUpViewModel.
 * Required given SignUpViewModel has a non-empty constructor
 */
class SignUpViewModelFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SignUpViewModel::class.java)) {
            return SignUpViewModel(
                    signUpRepository = SignUpRepository(
                            dataSource = SignUpDataSource()
                    )
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}