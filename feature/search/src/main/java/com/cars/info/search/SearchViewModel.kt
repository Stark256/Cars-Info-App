package com.cars.info.search

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cars.info.common.UiState
import com.cars.info.common.kotlin.mutableSignalFlow
import com.cars.info.common.kotlin.signal
import com.cars.info.common.lifecycle.Event
import com.cars.info.common.lifecycle.mutableEventFlow
import com.cars.info.common.lifecycle.tryEmit
import com.cars.info.common.models.CarListItemUI
import com.cars.info.data.models.car.Make
import com.cars.info.data.models.filter.FilterOptions
import com.cars.info.data.repository.CarRepository
import com.cars.info.data.repository.RepositoryResult
import com.cars.info.data.utils.convertToListItemUi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@OptIn(ExperimentalCoroutinesApi::class)
@HiltViewModel
class SearchViewModel @Inject constructor(
    application: Application,
    private val repository: CarRepository
) : ViewModel() {

    private companion object {
        private val EMPTY_CAR_LIST = emptyList<CarListItemUI>()
    }

    sealed interface Action {
        data class GoToFilterOptions(val filterOptions: FilterOptions): Action
    }

    private val _reload = mutableSignalFlow()

    private val filterOptions = MutableStateFlow(
        FilterOptions.default(
            makes = listOf(Make.BMW, Make.AUDI)
        )
    )

    private val carsResult = _reload
        .onEach {  uiState.tryEmit(UiState.Loading) }
        .flatMapLatest {
            repository.searchCars(
                searchQuery = searchField.value,
                filterOptions = filterOptions.value
            )
        }
        .map { result ->
            when (result) {
                is RepositoryResult.Success ->
                    result.result
                        .takeIf { it.isNotEmpty() }
                        ?.map { it.convertToListItemUi(application) }
                        ?.let { UiState.Success(it) } ?: UiState.Empty
                is RepositoryResult.Error -> {
                    UiState.Error(message = result.message)
                }
            }
        }
        .onEach { state ->
            uiState.tryEmit(state)
        }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.Eagerly,
            initialValue = EMPTY_CAR_LIST
        )

    private var isSearchPerformed = false

    private val _action = mutableEventFlow<Action>()
    val action: Flow<Event<Action>> = _action

    val uiState = MutableStateFlow<UiState<List<CarListItemUI>>>(UiState.Loading)

    val searchField = MutableStateFlow<String>("")

    init {
        reload()
    }

    fun onSearchButtonClicked() {
        reload()
        isSearchPerformed = true
    }

    fun onClearSearchClicked() {
        searchField.value = ""
        if(isSearchPerformed) {
            isSearchPerformed = false
            reload()
        }
    }

    fun onFilterClicked() {
        _action.tryEmit(Action.GoToFilterOptions(filterOptions.value))
    }

    fun onCarListItemClicked(item: CarListItemUI) {
//        TODO("Not yet implemented")
    }

    fun onCarListItemFavouriteClicked(item: CarListItemUI) {
//        TODO("Not yet implemented")
    }

    fun onCarListItemCompareClicked(item: CarListItemUI) {
//        TODO("Not yet implemented")
    }

    private fun reload() {
        _reload.signal()
    }
}