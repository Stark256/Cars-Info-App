package com.cars.info

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseFragment<T : ViewDataBinding> : Fragment() {

    private val bindingHandler: BindingHandler<T> = BindingHandler()
    protected val binding: T?
        get() = bindingHandler.binding

    abstract fun createBinding(inflater: LayoutInflater): T
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = createBinding(inflater).also {
        bindingHandler.setupBindingHandling(
            binding = it,
            viewLifecycleOwner = viewLifecycleOwner
        )
    }.root

}