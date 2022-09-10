package com.example.multiplerecyclerviewexample.ItemAd

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerviewexample.databinding.RecyclerAdBinding

class RecyclerAdViewHolder(private val binding: RecyclerAdBinding) : RecyclerView.ViewHolder(binding.root) {

    fun populate(model: AddLists) {
        val adAdapter = AdAdapter()
        adAdapter.models = model.list

        binding.recyclerViewAd.adapter = adAdapter
    }

}