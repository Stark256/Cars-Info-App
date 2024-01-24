package com.cars.info.account

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import com.cars.info.account.databinding.FragmentAccountBinding
import com.cars.info.common.fragment.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AccountFragment : BaseFragment<FragmentAccountBinding>() {

    private val viewModel: AccountViewModel by viewModels()

    override fun createBinding(inflater: LayoutInflater): FragmentAccountBinding =
        FragmentAccountBinding.inflate(inflater).apply {
            lifecycleOwner = viewLifecycleOwner
        }
}