package com.cars.info.data.models

sealed interface EngineDisplacement {
    data object Electric: EngineDisplacement
    data class Value(val value: Float): EngineDisplacement
}