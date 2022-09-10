package com.example.multiplerecyclerviewexample.ItemPost

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerviewexample.databinding.RecyclerPostBinding

class RecyclerPostViewHolder(private val binding: RecyclerPostBinding) : RecyclerView.ViewHolder(binding.root) {

    fun populate(model: AddPost){
        val postAdapter = PostAdapter()
        postAdapter.models = model.list

        binding.recyclerViewPost.adapter = postAdapter
    }
}