package com.pandorina.newsappwithnavigation.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pandorina.newsappwithnavigation.data.DailyWeather
import com.pandorina.newsappwithnavigation.data.HourlyWeather
import com.pandorina.newsappwithnavigation.databinding.ItemHorizontalWeatherBinding
import com.pandorina.newsappwithnavigation.databinding.ItemVerticalWeatherBinding

class HourlyWeatherAdapter(private val list: List<HourlyWeather>): RecyclerView.Adapter<HourlyWeatherAdapter.Holder>() {
    class Holder(private val binding: ItemHorizontalWeatherBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(item: HourlyWeather){
            binding.hourlyWeather = item
            binding.ivHourlyWeatherImage.setImageResource(item.icon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HourlyWeatherAdapter.Holder {
        val binding = ItemHorizontalWeatherBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: HourlyWeatherAdapter.Holder, position: Int) {
        val item = list[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = list.size
}