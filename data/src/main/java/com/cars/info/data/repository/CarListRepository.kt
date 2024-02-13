package com.cars.info.data.repository

import com.cars.info.data.models.car.Car
import com.cars.info.data.models.car.Make
import com.cars.info.data.models.filter.FilterOptions
import com.cars.info.data.source.remote.RemoteCarDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class CarListRepository @Inject constructor(
    private val remoteDataSource: RemoteCarDataSource
): CarRepository {
    override suspend fun searchCars(searchQuery: String, filterOptions: FilterOptions): Flow<RepositoryResult<List<Car>>> =
        flowOf(
            remoteDataSource.searchCars(
                searchQuery = searchQuery,
                filterOptions = filterOptions
            ).fold(
                onSuccess = { list -> RepositoryResult.Success(list) },
                onFailure = { RepositoryResult.Error("Can not search cars.") }
            )
        )

    override suspend fun getCarById(make: Make, id: String): Flow<RepositoryResult<Car>> =
        flowOf(
            remoteDataSource.getCarById(
                make = make,
                id = id
            ).fold(
                onSuccess = { car ->
                    car?.let { RepositoryResult.Success(car) }
                        ?: RepositoryResult.Error("Can not get this car.")
                            },
                onFailure = { RepositoryResult.Error("Can not get this car.") }
            )
        )

    override suspend fun addToCompare(make: Make, id: String) {
        TODO("Not yet implemented")
    }

    override suspend fun addToFavourites(make: Make, id: String) {
        TODO("Not yet implemented")
    }
}