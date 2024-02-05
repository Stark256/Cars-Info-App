package com.cars.info.data.repository

import com.cars.info.data.models.Car
import com.cars.info.data.models.Make
import com.cars.info.data.source.remote.RemoteCarDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class CarListRepository @Inject constructor(
    private val remoteDataSource: RemoteCarDataSource
): CarRepository {

    override suspend fun getCars(make: Make?): Flow<List<Car>> =
        flowOf(
            make?.let {
                remoteDataSource.getCarsByMake(make = make).fold(
                    onSuccess = { list -> list },
                    onFailure = { emptyList() }
                )
            } ?: remoteDataSource.getAllCars().fold(
                onSuccess = { list -> list },
                onFailure = { emptyList() }
            )
        )

    override suspend fun getCarById(make: Make, id: String): Flow<Car?> =
        flowOf(
            remoteDataSource.getCarById(make = make, id = id).fold(
                onSuccess = { car -> car},
                onFailure = { null }
            )
        )

    override suspend fun addToCompare(make: Make, id: String) {
        TODO("Not yet implemented")
    }

    override suspend fun addToFavourites(make: Make, id: String) {
        TODO("Not yet implemented")
    }
}