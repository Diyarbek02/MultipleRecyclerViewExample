package com.example.multiplerecyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.multiplerecyclerviewexample.ItemAd.Ad
import com.example.multiplerecyclerviewexample.ItemAd.AddLists
import com.example.multiplerecyclerviewexample.ItemPost.AddPost
import com.example.multiplerecyclerviewexample.ItemPost.Post
import com.example.multiplerecyclerviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var adapter =  MyAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setData()
        binding.recyclerView.adapter = adapter
        binding.recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }
    private fun setData(){
        var models = mutableListOf<ListAndPostParent>()
        for(i in 0..50){
            if(i%5==0){
                val t = mutableListOf<Ad>()
            for(j in 0..30){
                    val reklama = Ad(ListAndPostParent.AD_TYPE, "", "")
                    t.add(reklama)
            }
                val addLists = AddLists(t, ListAndPostParent.AD_TYPE)
                models.add(addLists)
            }else {
                val t = mutableListOf<Post>()
                for(k in 0..30){
                val post = Post(ListAndPostParent.POST_TYPE, "", "")
                t.add(post)
                }
                val addPost = AddPost(t, ListAndPostParent.POST_TYPE)
                models.add(addPost)
            }
        }
        adapter.models = models
    }
}