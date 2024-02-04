package com.cars.info

import androidx.annotation.IdRes
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cars.info.common.lifecycle.Event
import com.cars.info.common.lifecycle.mutableEventFlow
import com.cars.info.common.lifecycle.tryEmit
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {
    sealed interface Action {
        data object GoToSearch : Action
        data object GoToComparation : Action
        data object GoToAccount : Action
    }

    private var destination = MutableStateFlow(R.id.nav_splash)

    private val _action = mutableEventFlow<Action>()
    val action: Flow<Event<Action>> = _action

    init {
        viewModelScope.launch {
            destination.map {
                when (it) {
                    R.id.nav_splash -> Action.GoToSearch
                    com.cars.info.search.R.id.nav_search -> Action.GoToSearch
                    com.cars.info.compare.R.id.nav_compare -> Action.GoToComparation
                    com.cars.info.account.R.id.nav_account -> Action.GoToAccount
                    else -> null
                }
            }
                .filterNotNull()
                .onEach { _action.tryEmit(it) }
                .collect()
        }
    }

    fun onNewDestination(@IdRes destination: Int) {
        this.destination.value = destination
    }
}
