package com.example.multiplerecyclerviewexample.ItemAd

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerviewexample.R
import com.example.multiplerecyclerviewexample.databinding.ItemAdBinding

class AdAdapter : RecyclerView.Adapter<AdViewHolder>() {
    var models = listOf<Ad>()
    @SuppressLint("NotifyDataSetChanged")
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_ad, parent, false)
        val binding = ItemAdBinding.bind(view)
        return AdViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AdViewHolder, position: Int) {
        holder.populate(models[position])
    }

    override fun getItemCount(): Int = models.size
}