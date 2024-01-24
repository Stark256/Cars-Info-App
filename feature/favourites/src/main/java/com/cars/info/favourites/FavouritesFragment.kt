package com.cars.info.favourites

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import com.cars.info.common.fragment.BaseFragment
import com.cars.info.favourites.databinding.FragmentFavouritesBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FavouritesFragment : BaseFragment<FragmentFavouritesBinding>() {

    private val viewModel: FavouritesViewModel by viewModels()

    override fun createBinding(inflater: LayoutInflater): FragmentFavouritesBinding =
        FragmentFavouritesBinding.inflate(inflater).apply {
            lifecycleOwner = viewLifecycleOwner
        }
}