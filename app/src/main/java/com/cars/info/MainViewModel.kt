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
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {
    sealed interface Action {
        data object GoToSearch : Action
        data object GoToFavourites : Action
        data object GoToAccount : Action
        data object GoToAuth : Action
    }

    private var destination = MutableStateFlow(R.id.nav_splash)

    // TODO change to data store values
    private val isUserLoggedIn = MutableStateFlow(true)

//    private val _authAction: Flow<Event<Action>?> = combine(
//        isUserLoggedIn,
//        destination
//    ) { isUserLoggedIn, destination ->
//        when {
//            destination == R.id.nav_splash && !isUserLoggedIn -> Action.GoToAuth
//            destination == R.id.nav_splash && isUserLoggedIn -> Action.GoToSearch
//            else -> null
//        }
//    }
//        .map { it?.let { Event(it) } }
//        .debounce(2000L)
//
//    private val _mainTabsAction: Flow<Event<Action>?> = destination
//        .map {
//            when (it) {
//                com.cars.info.search.R.id.nav_search -> Action.GoToSearch
//                com.cars.info.favourites.R.id.nav_favourites -> Action.GoToFavourites
//                com.cars.info.account.R.id.nav_account -> Action.GoToAccount
//                else -> null
//            }
//        }
//        .map { it?.let { Event(it) } }
//
//    val action: Flow<Event<Action>> = listOf(
//        _authAction,
//        _mainTabsAction
//    )
//        .let { flows ->
//            combine(flows) { actions ->
//                actions.firstOrNull { it?.handled == false }
//            }
//        }
//        .filterNotNull()
//        .shareIn(
//            scope = viewModelScope,
//            started = SharingStarted.Lazily,
//            replay = 0
//        )

    private val _action = mutableEventFlow<Action>()
    val action: Flow<Event<Action>> = _action

    init {
        viewModelScope.launch {
            combine(
                destination,
                isUserLoggedIn
            ) { destination, isUserLoggedIn ->
                when {
                    destination == R.id.nav_splash && !isUserLoggedIn -> Action.GoToAuth
                    destination == R.id.nav_splash && isUserLoggedIn -> Action.GoToSearch
                    destination == com.cars.info.search.R.id.nav_search -> Action.GoToSearch
                    destination == com.cars.info.favourites.R.id.nav_favourites -> Action.GoToFavourites
                    destination == com.cars.info.account.R.id.nav_account -> Action.GoToAccount
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
