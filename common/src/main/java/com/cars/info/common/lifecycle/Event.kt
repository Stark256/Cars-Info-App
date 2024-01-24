package com.cars.info.common.lifecycle

import androidx.lifecycle.MutableLiveData

/**
 *
 * Intended for use with [Flows][androidx.lifecycle.LiveData], `Event` class encapsulates an
 * object that should only be handled once.
 *
 * Based on `Event` class from Jose Alcerreca (see [Event.kt | Github](https://gist.github.com/JoseAlcerreca/5b661f1800e1e654f07cc54fe87441af#file-event-kt))
 *
 * @param handled Value is `true` if event has occurred already.
 */
data class Event<T> private constructor(
    private val content: T,
    private var _handled: Boolean
) {

    val handled: Boolean
        get() = _handled

    constructor(content: T) : this(content = content, _handled = false)

    /**
     * Previews the content without side-effect.
     */
    fun peek() = content

    /**
     * Returns the content to be handled or `null` if content has already been handled.
     */
    fun pop(): T? {
        return if (handled) {
            null
        } else {
            _handled = true
            content
        }
    }
}

/**
 * Shorthand for posting an [Event] with the given value.
 */
fun <T> MutableLiveData<Event<T>>.postValue(value: T) {
    postValue(Event(value))
}
