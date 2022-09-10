package com.example.multiplerecyclerviewexample.ItemPost

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerviewexample.ItemPost.Post
import com.example.multiplerecyclerviewexample.R
import com.example.multiplerecyclerviewexample.ItemPost.PostViewHolder
import com.example.multiplerecyclerviewexample.databinding.ItemPostBinding

class PostAdapter : RecyclerView.Adapter<PostViewHolder>() {
    var models = listOf<Post>()
    @SuppressLint("NotifyDataSetChanged")
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        val binding = ItemPostBinding.bind(view)
        return PostViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.populate(models[position])
    }

    override fun getItemCount(): Int = models.size
}