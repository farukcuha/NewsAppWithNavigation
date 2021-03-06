package com.pandorina.newsappwithnavigation.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.pandorina.newsappwithnavigation.data.model.News
import com.pandorina.newsappwithnavigation.databinding.ItemNewsBinding
import com.pandorina.newsappwithnavigation.ui.fragment.NewsFragmentDirections

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.NewsHolder>() {
    var newsList: List<News> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    class NewsHolder(private val binding: ItemNewsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: News) {
            binding.news = item

            binding.root.setOnClickListener {
                val action = NewsFragmentDirections.actionNavNewsToNavDetail(item.id)
                binding.root.findNavController().navigate(action)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsHolder {
        val binding = ItemNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NewsHolder(binding)
    }

    override fun onBindViewHolder(holder: NewsHolder, position: Int) {
        val item = newsList[position]
        holder.bind(item)
        holder.itemView.setOnClickListener{
            val action = NewsFragmentDirections.actionNavNewsToNavDetail(item.id)
            holder.itemView.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int = newsList.size
}