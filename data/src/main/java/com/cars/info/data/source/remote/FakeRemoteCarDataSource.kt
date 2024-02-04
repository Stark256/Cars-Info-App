package com.cars.info.data.source.remote

import com.cars.info.common.di.IODispatcher
import com.cars.info.data.cars.AUDI
import com.cars.info.data.cars.BMW
import com.cars.info.data.cars.CHEVROLET
import com.cars.info.data.cars.FORD
import com.cars.info.data.cars.NISSAN
import com.cars.info.data.cars.TOYOTA
import com.cars.info.data.models.Car
import com.cars.info.data.models.Make
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

class FakeRemoteCarDataSource @Inject constructor(
    @IODispatcher private val dispatcher: CoroutineDispatcher
) : RemoteCarDataSource {

    override suspend fun getAllCars(): Result<List<Car>> =
        withContext(dispatcher) {
            Result.success(getAllCarsList())
        }


    override suspend fun getCarsByMake(make: Make): Result<List<Car>> =
        withContext(dispatcher) {
            Result.success(getCarListByMake(make))
        }

    override suspend fun getCarById(make: Make, id: String): Result<Car?> =
        withContext(dispatcher) {
            Result.success(
                getCarListByMake(make)
                    .firstOrNull { car ->  car.id == id }
            )
        }

    private fun getCarListByMake(make: Make): List<Car> =
        when(make) {
            Make.AUDI -> AUDI.list
            Make.BMW -> BMW.list
            Make.CHEVROLET -> CHEVROLET.list
            Make.FORD -> FORD.list
            Make.NISSAN -> NISSAN.list
            Make.TOYOTA -> TOYOTA.list
        }

    private fun getAllCarsList() : List<Car> {
        val list = arrayListOf<Car>()

        list.addAll(AUDI.list)
        list.addAll(BMW.list)
        list.addAll(CHEVROLET.list)
        list.addAll(FORD.list)
        list.addAll(NISSAN.list)
        list.addAll(TOYOTA.list)

        return list
    }
}