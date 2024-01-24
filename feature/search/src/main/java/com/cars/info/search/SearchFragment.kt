package com.cars.info.search

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import com.cars.info.common.fragment.BaseFragment
import com.cars.info.search.databinding.FragmentSearchBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment : BaseFragment<FragmentSearchBinding>() {

    private val viewModel: SearchViewModel by viewModels()

    override fun createBinding(inflater: LayoutInflater): FragmentSearchBinding =
        FragmentSearchBinding.inflate(inflater).apply {
            lifecycleOwner = viewLifecycleOwner
        }
}