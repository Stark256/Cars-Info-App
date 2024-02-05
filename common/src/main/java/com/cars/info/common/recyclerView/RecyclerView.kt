package com.cars.info.common.recyclerView

import android.content.Context
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.cars.info.common.R

fun RecyclerView.addDivider(context: Context) {
    val itemDecoration = DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
    ContextCompat.getDrawable(context, R.drawable.divider_thin)?.let {
        itemDecoration.setDrawable(it)
    }
    addItemDecoration(itemDecoration)
}