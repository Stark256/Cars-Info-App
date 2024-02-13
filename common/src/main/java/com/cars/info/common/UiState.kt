package com.cars.info.common

sealed interface UiState<out T: Any> {
    data class Error(val message: String): UiState<Nothing>
    data object Loading: UiState<Nothing>
    data object Empty: UiState<Nothing>
    data class Success<out T: Any>(val result: T): UiState<T>

}