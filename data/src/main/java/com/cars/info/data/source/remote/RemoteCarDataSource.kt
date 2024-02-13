package com.cars.info.data.source.remote

import com.cars.info.data.models.car.Car
import com.cars.info.data.models.car.Make
import com.cars.info.data.models.filter.FilterOptions

interface RemoteCarDataSource {
    suspend fun searchCars(searchQuery: String, filterOptions: FilterOptions): Result<List<Car>>
    suspend fun getCarById(make: Make, id: String): Result<Car?>
}