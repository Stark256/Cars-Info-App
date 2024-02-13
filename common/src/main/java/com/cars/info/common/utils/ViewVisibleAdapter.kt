package com.cars.info.common.utils

import android.view.View
import androidx.databinding.BindingAdapter

object ViewVisibleAdapter {

    @JvmStatic
    @BindingAdapter("isVisible")
    fun setIsVisible(view: View, visible: Boolean) {
        val visibility = if(visible) View.VISIBLE else View.GONE
        if(view.visibility != visibility) {
            view.visibility = visibility
        }
    }
}