package com.cars.info.common.models

import androidx.annotation.DrawableRes
import com.cars.info.common.R

data class ImageTextUI(
    val text: String,
    @DrawableRes val icon: Int
) {
    companion object {
        fun default() = ImageTextUI(
            text = "",
            icon = R.drawable.ic_transmission_auto
        )
    }
}