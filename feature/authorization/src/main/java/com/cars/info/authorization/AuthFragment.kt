package com.cars.info.authorization

import android.view.LayoutInflater
import com.cars.info.authorization.databinding.FragmentAuthBinding
import com.cars.info.common.fragment.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AuthFragment : BaseFragment<FragmentAuthBinding>() {

    override fun createBinding(inflater: LayoutInflater): FragmentAuthBinding =
        FragmentAuthBinding.inflate(inflater).apply {
            lifecycleOwner = viewLifecycleOwner
        }
}