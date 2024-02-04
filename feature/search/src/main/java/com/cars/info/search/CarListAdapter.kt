package com.cars.info.search

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.cars.info.common.databinding.CarListItemBinding
import com.cars.info.common.models.CarListItemUI

internal class CarListAdapter(
    private val carListItemClickListener: CarListItemClickListener? = null,
    private val carListItemCompareClickListener: CarListItemCompareClickListener? = null,
    private val carListItemFavouritesClickListener: CarListItemFavouritesClickListener? = null,
) : ListAdapter<CarListItemUI, CarListAdapter.ViewHolder>(DIFF_CALLBACK) {

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<CarListItemUI>() {
            override fun areItemsTheSame(
                oldItem: CarListItemUI,
                newItem: CarListItemUI
            ): Boolean = oldItem.id == newItem.id

            @SuppressLint("DiffUtilEquals")
            override fun areContentsTheSame(
                oldItem: CarListItemUI,
                newItem: CarListItemUI
            ): Boolean = oldItem == newItem

//            override fun getChangePayload(
//                oldItem: CarListItemUI,
//                newItem: CarListItemUI
//            ): Any?  = newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            binding = CarListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

//    override fun onBindViewHolder(holder: ViewHolder, position: Int, payloads: MutableList<Any>) {
//        if(payloads.isNotEmpty()) {
//            payloads.forEach {
//                if(it is CarListItemUI) {
//                    holder.update(it)
//                }
//            }
//        } else {
//            super.onBindViewHolder(holder, position, payloads)
//        }
//    }

    inner class ViewHolder(
        private val binding: CarListItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(carListItemUI: CarListItemUI) {
            binding.apply {
                carListItem = carListItemUI
            }
        }
        fun update(carListItemUI: CarListItemUI) {
            binding.carListItem = carListItemUI
        }
    }
}

internal interface CarListItemClickListener {
    fun onItemClicked(item: CarListItemUI)
}

internal interface CarListItemCompareClickListener {
    fun onItemClicked(item: CarListItemUI)
}

internal interface CarListItemFavouritesClickListener {
    fun onItemClicked(item: CarListItemUI)
}