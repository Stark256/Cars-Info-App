package com.cars.info.data.repository

sealed interface RepositoryResult<out T: Any> {
    data class Error(val message: String): RepositoryResult<Nothing>
    data class Success<out T: Any>(val result: T): RepositoryResult<T>
}