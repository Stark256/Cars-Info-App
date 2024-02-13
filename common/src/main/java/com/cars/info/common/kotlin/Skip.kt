package com.cars.info.common.kotlin

import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow

/**
 * Global constant that can be used for `when` cases with no associated action.
 */
val skip = Unit
