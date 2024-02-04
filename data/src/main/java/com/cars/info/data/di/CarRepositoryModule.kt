package com.cars.info.data.di

import com.cars.info.data.repository.CarListRepository
import com.cars.info.data.repository.CarRepository
import com.cars.info.data.source.remote.FakeRemoteCarDataSource
import com.cars.info.data.source.remote.RemoteCarDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class CarRepositoryModule {

    @Binds
    abstract fun bindCarRepository(
        carListRepository: CarListRepository
    ): CarRepository

    @Binds
    abstract fun bindRemoteDataSource(
        carRemoteDataSource: FakeRemoteCarDataSource
    ): RemoteCarDataSource
}