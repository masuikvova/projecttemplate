package com.example.masuikvova.data.repository

import com.example.masuikvova.domain.repository.LoginRepository

class LoginRepositoryImp : LoginRepository {
    override fun login(email: String, password: String): String {
        return "login $email  $password"
    }

    override fun signUp(email: String, password: String): String {
        return "signup $email   $password"
    }
}