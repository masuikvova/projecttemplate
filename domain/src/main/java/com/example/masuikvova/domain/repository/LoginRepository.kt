package com.example.masuikvova.domain.repository

interface LoginRepository {

    fun login(email:String, password:String):String

    fun signUp(email:String, password:String):String


}