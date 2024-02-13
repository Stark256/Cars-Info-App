package com.cars.info.search

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.cars.info.common.UiState
import com.cars.info.common.fragment.BaseFragment
import com.cars.info.common.kotlin.skip
import com.cars.info.common.lifecycle.Event
import com.cars.info.common.models.CarListItemUI
import com.cars.info.common.recyclerView.addDivider
import com.cars.info.data.models.filter.FilterOptions
import com.cars.info.search.databinding.FragmentSearchBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

@SuppressLint("UnsafeRepeatOnLifecycleDetector")
@AndroidEntryPoint
class SearchFragment : BaseFragment<FragmentSearchBinding>() {

    private val viewModel: SearchViewModel by viewModels()
    private val adapter: CarListAdapter = CarListAdapter(
        carListItemClickListener = object : CarListItemClickListener {
            override fun onItemClicked(item: CarListItemUI) {
                viewModel.onCarListItemClicked(item)
            }
        },
        carListItemCompareClickListener = object : CarListItemCompareClickListener {
            override fun onItemClicked(item: CarListItemUI) {
                viewModel.onCarListItemCompareClicked(item)
            }
        },
        carListItemFavouritesClickListener = object : CarListItemFavouritesClickListener {
            override fun onItemClicked(item: CarListItemUI) {
                viewModel.onCarListItemFavouriteClicked(item)
            }
        }
    )

    override fun createBinding(inflater: LayoutInflater): FragmentSearchBinding =
        FragmentSearchBinding.inflate(inflater).apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = this@SearchFragment.viewModel
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.searchCarList?.apply {
            adapter = this@SearchFragment.adapter
            addDivider(context)
        }

        binding?.searchCarListEditText?.setOnEditorActionListener { _, i, _ ->
            viewModel.onSearchButtonClicked()
            return@setOnEditorActionListener false
        }

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED) {
                viewModel.action
                    .onEach(::handleEvent)
                    .collect()
            }
        }

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.CREATED) {
                viewModel.uiState
                    .onEach { state ->
                        when(state) {
                            is UiState.Success<List<CarListItemUI>> -> adapter.submitList(state.result)
                            else -> skip
                        }
                    }
                    .collect()
            }
        }
    }

    private fun handleEvent(event: Event<SearchViewModel.Action>) {
        when(val action = event.pop()) {
            is SearchViewModel.Action.GoToFilterOptions -> navigateToFilterOptionsScreen(action.filterOptions)
            null -> skip
        }
    }

    private fun navigateToFilterOptionsScreen(filterOptions: FilterOptions) {
        // TODO implement
    }
}