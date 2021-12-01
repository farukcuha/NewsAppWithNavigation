package com.pandorina.newsappwithnavigation.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pandorina.newsappwithnavigation.data.model.DailyWeather
import com.pandorina.newsappwithnavigation.databinding.ItemVerticalWeatherBinding

class DailyWeatherAdapter(private val list: List<DailyWeather>): RecyclerView.Adapter<DailyWeatherAdapter.Holder>() {
    class Holder(private val binding: ItemVerticalWeatherBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(item: DailyWeather){
            binding.dailyWeather = item
            binding.ivDailyWeatherImage.setImageResource(item.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding =
            ItemVerticalWeatherBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val item = list[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = list.size
}