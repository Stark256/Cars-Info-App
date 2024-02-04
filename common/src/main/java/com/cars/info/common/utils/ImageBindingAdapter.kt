package com.cars.info.common.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter

object ImageBindingAdapter {

    @JvmStatic
    @BindingAdapter("imageUrl")
    fun bindImageUrl(view: ImageView, imageUrl: String) {
        // TODO add glide to download image
    }


}