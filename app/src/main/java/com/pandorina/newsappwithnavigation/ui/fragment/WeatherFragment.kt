package com.pandorina.newsappwithnavigation.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.pandorina.newsappwithnavigation.data.resource.WeatherData
import com.pandorina.newsappwithnavigation.databinding.FragmentWeatherBinding
import com.pandorina.newsappwithnavigation.ui.adapter.DailyWeatherAdapter
import com.pandorina.newsappwithnavigation.ui.adapter.HourlyWeatherAdapter

class WeatherFragment : BaseFragment<FragmentWeatherBinding>(FragmentWeatherBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dailyWeatherAdapter = DailyWeatherAdapter(WeatherData.getDailyWeather)
        val hourlyWeatherAdapter = HourlyWeatherAdapter(WeatherData.getHourlyList)

        binding.rvWeeklyWeather.apply {
            setHasFixedSize(true)
            adapter = dailyWeatherAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        binding.rvHourlyWeather.apply {
            setHasFixedSize(true)
            adapter = hourlyWeatherAdapter
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }


    }

}