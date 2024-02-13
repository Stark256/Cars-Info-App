package com.cars.info.data.source.remote

import com.cars.info.common.di.IODispatcher
import com.cars.info.data.cars.AUDI
import com.cars.info.data.cars.BMW
import com.cars.info.data.cars.CHEVROLET
import com.cars.info.data.cars.FORD
import com.cars.info.data.cars.NISSAN
import com.cars.info.data.cars.TOYOTA
import com.cars.info.data.models.car.Car
import com.cars.info.data.models.car.Make
import com.cars.info.data.models.filter.FilterOptions
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

class FakeRemoteCarDataSource @Inject constructor(
    @IODispatcher private val dispatcher: CoroutineDispatcher
) : RemoteCarDataSource {

    override suspend fun searchCars(searchQuery: String, filterOptions: FilterOptions): Result<List<Car>>  =
        withContext(dispatcher) {
            Result.success(
                searchFilterCars(
                    searchQuery = searchQuery,
                    filterOptions = filterOptions
                )
            )
        }

    override suspend fun getCarById(make: Make, id: String): Result<Car?> =
        withContext(dispatcher) {
            Result.success(
                getCarListByMake(make)
                    .firstOrNull { car ->  car.id == id }
            )
        }

    private fun searchFilterCars(searchQuery: String, filterOptions: FilterOptions): List<Car> =
        getAllCarsList()
            .asSequence()
            .filter { (it.make.string + " " + it.model + " " + it.year).contains(searchQuery.trim(), ignoreCase = true) }
            .filter { filterOptions.makes.isCarParameterIsInList(it.make) }
            .filter { filterOptions.bodyTypes.isCarParameterIsInList(it.bodyType) }
            .filter { filterOptions.transmissionTypes.isCarParameterIsInList(it.transmissionType) }
            .filter { filterOptions.priceRange?.contains(it.price) ?: true }
            .toList()

    private fun <T> List<T>.isCarParameterIsInList(parameter: T): Boolean =
        this.takeIf { it.isNotEmpty() }?.contains(parameter) ?: true

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