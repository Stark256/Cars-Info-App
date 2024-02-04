package com.cars.info.compare

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import com.cars.info.common.fragment.BaseFragment
import com.cars.info.compare.databinding.FragmentCompareBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CompareFragment : BaseFragment<FragmentCompareBinding>() {
    private val viewModel: CompareViewModel by viewModels()

    override fun createBinding(inflater: LayoutInflater): FragmentCompareBinding =
        FragmentCompareBinding.inflate(inflater).apply {
            lifecycleOwner = viewLifecycleOwner
        }
}