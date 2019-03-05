package com.example.masuikvova.domain.entities

sealed class DataWrapper<T> {
    class Success<T>(var data: T) : DataWrapper<T>()
    class Error<T>(val error: Throwable) : DataWrapper<T>()
    class Loading<T> : DataWrapper<T>()
}