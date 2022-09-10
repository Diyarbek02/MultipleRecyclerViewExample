package com.example.multiplerecyclerviewexample

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerviewexample.ItemAd.AddLists
import com.example.multiplerecyclerviewexample.ItemAd.RecyclerAdViewHolder
import com.example.multiplerecyclerviewexample.ItemPost.AddPost
import com.example.multiplerecyclerviewexample.ItemPost.RecyclerPostViewHolder
import com.example.multiplerecyclerviewexample.databinding.RecyclerAdBinding
import com.example.multiplerecyclerviewexample.databinding.RecyclerPostBinding

class MyAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var models = listOf<ListAndPostParent>()
    @SuppressLint("NotifyDataSetChanged")
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view: View
        return if(viewType == ListAndPostParent.AD_TYPE) {
            view =  LayoutInflater.from(parent.context).inflate(R.layout.recycler_ad, parent, false)
            val binding = RecyclerAdBinding.bind(view)
            RecyclerAdViewHolder(binding)
        }else {
            view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_post, parent, false)
            val binding = RecyclerPostBinding.bind(view)
            RecyclerPostViewHolder(binding)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(getItemViewType(position) == ListAndPostParent.AD_TYPE) {
            (holder as RecyclerAdViewHolder).populate(models[position] as AddLists)
        }else {
            (holder as RecyclerPostViewHolder).populate(models[position]as AddPost)
        }
    }

    override fun getItemCount(): Int = models.size

    override fun getItemViewType(position: Int): Int {
        return models[position].type
    }
}