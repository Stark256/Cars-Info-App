package com.cars.info.data.repository

import com.cars.info.data.models.car.Car
import com.cars.info.data.models.car.Make
import com.cars.info.data.models.filter.FilterOptions
import kotlinx.coroutines.flow.Flow


interface CarRepository {
    suspend fun searchCars(searchQuery: String, filterOptions: FilterOptions): Flow<RepositoryResult<List<Car>>>
    suspend fun getCarById(make: Make, id: String): Flow<RepositoryResult<Car>>
    suspend fun addToCompare(make: Make, id: String)
    suspend fun addToFavourites(make: Make, id: String)
}