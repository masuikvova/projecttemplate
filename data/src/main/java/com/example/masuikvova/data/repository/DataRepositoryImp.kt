package com.example.masuikvova.data.repository

import com.example.masuikvova.domain.repository.DataRepository

class DataRepositoryImp:DataRepository {
    override fun loadData(quary: String): String {
        return  "loaded data for quary $quary"
    }
}