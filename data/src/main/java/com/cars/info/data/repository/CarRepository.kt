package com.cars.info.data.repository

import com.cars.info.data.models.Car
import com.cars.info.data.models.Make
import kotlinx.coroutines.flow.Flow


interface CarRepository {
    suspend fun getCars(make: Make?): Flow<List<Car>>
    suspend fun getCarById(make: Make, id: String): Flow<Car?>
    suspend fun addToCompare(make: Make, id: String)
    suspend fun addToFavourites(make: Make, id: String)
}