package com.cars.info

import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow

fun <T> mutableEventFlow(): MutableSharedFlow<Event<T>> =
    MutableSharedFlow(replay = 1, onBufferOverflow = BufferOverflow.DROP_OLDEST)

/**
 * Wrapper method to emit an [Event] with the given value.
 */
fun <T> MutableSharedFlow<Event<T>>.tryEmit(value: T) {
    tryEmit(Event(value))
}