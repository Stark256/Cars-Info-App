package com.cars.info.common.fragment

import androidx.core.view.allViews
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class BindingHandler<T : ViewDataBinding> : LifecycleObserver {
    var binding: T? = null
        private set

    fun clearBinding() {
        binding?.root?.allViews
            ?.mapNotNull { it as? RecyclerView }
            ?.onEach { it.adapter = null }
            ?.all { true }

        binding?.root?.allViews
            ?.mapNotNull { it as? ViewPager2 }
            ?.onEach { it.adapter = null }
            ?.all { true }

        binding = null
    }

    fun setupBindingHandling(binding: T, viewLifecycleOwner: LifecycleOwner): T =
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            viewLifecycleOwner.lifecycle.addObserver(this@BindingHandler)
        }.also {
            this.binding = it
        }
}