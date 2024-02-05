package com.cars.info.search

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cars.info.common.models.CarListItemUI
import com.cars.info.data.models.Make
import com.cars.info.data.repository.CarRepository
import com.cars.info.data.utils.convertToListItemUi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@OptIn(ExperimentalCoroutinesApi::class)
@HiltViewModel
class SearchViewModel @Inject constructor(
    application: Application,
    private val repository: CarRepository
) : ViewModel() {

    private val make = MutableStateFlow<Make?>(Make.BMW)

    val cars: StateFlow<List<CarListItemUI>> = make
        .flatMapLatest { repository.getCars(it) }
        .map { list ->
            list.map { it.convertToListItemUi(application) }
        }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.Eagerly,
            initialValue = emptyList()
        )

    fun onCarListItemClicked(item: CarListItemUI) {
//        TODO("Not yet implemented")
    }

    fun onCarListItemFavouriteClicked(item: CarListItemUI) {
//        TODO("Not yet implemented")
    }

    fun onCarListItemCompareClicked(item: CarListItemUI) {
//        TODO("Not yet implemented")
    }

}