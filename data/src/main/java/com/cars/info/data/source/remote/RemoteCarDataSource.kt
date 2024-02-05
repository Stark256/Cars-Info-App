package com.cars.info.data.source.remote

import com.cars.info.data.models.Car
import com.cars.info.data.models.Make

interface RemoteCarDataSource {
    suspend fun getAllCars(): Result<List<Car>>
    suspend fun getCarsByMake(make: Make): Result<List<Car>>
    suspend fun getCarById(make: Make, id: String): Result<Car?>
}