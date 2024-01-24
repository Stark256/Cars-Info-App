package com.cars.info

import androidx.annotation.IdRes
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    sealed interface Action {
        data object GoToSearch: Action
        data object GoToFavourites: Action
        data object GoToAccount: Action
    }

    private var destination = MutableStateFlow(R.id.search_nav)

    private val _action = mutableEventFlow<Action>()
    val action: Flow<Event<Action>> = _action

    init {
        viewModelScope.launch {
            destination.map {
                    when (it) {
                        com.cars.info.search.R.id.nav_search -> Action.GoToSearch
                        com.cars.info.favourites.R.id.nav_favourites -> Action.GoToFavourites
                        com.cars.info.account.R.id.nav_account -> Action.GoToAccount
                        else -> null
                    }
                }
                .filterNotNull()
                .onEach {
                    _action.tryEmit(it)
                }
        }
    }

    fun onNewDestination(@IdRes destination: Int) {
        this.destination.value = destination
    }
}