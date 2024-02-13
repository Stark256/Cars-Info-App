package com.cars.info.common.kotlin

import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow

typealias Signal = Unit
typealias SignalFlow = SharedFlow<Unit>
typealias MutableSignalFlow = MutableSharedFlow<Unit>

/**
 * A shared flow with no underlying value. Intended to signal other flows that an event has been triggered.
 */
fun mutableSignalFlow(): MutableSignalFlow = MutableSharedFlow(
    extraBufferCapacity = 1,
    onBufferOverflow = BufferOverflow.DROP_OLDEST
)

fun MutableSignalFlow.signal() = tryEmit(Unit)