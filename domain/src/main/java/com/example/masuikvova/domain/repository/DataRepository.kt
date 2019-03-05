package com.example.masuikvova.domain.repository

interface DataRepository {

    fun loadData(quary: String): String
}