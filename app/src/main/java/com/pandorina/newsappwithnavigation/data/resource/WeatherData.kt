package com.pandorina.newsappwithnavigation.data.resource

import com.pandorina.newsappwithnavigation.R
import com.pandorina.newsappwithnavigation.data.model.DailyWeather
import com.pandorina.newsappwithnavigation.data.model.HourlyWeather

object WeatherData {
    val getHourlyList = listOf(
        HourlyWeather("12:00", "26°", R.drawable.sun),
        HourlyWeather("13:00", "26°", R.drawable.sun),
        HourlyWeather("14:00", "25°", R.drawable.sun),
        HourlyWeather("15:00", "24°", R.drawable.sun),
        HourlyWeather("16:00", "24°", R.drawable.cloudy),
        HourlyWeather("17:00", "22°", R.drawable.cloudy),
        HourlyWeather("18:00", "21°", R.drawable.cloudy),
        HourlyWeather("19:00", "20°", R.drawable.cloudy),
        HourlyWeather("20:00", "20°", R.drawable.cloudy_night),
        HourlyWeather("21:00", "19°", R.drawable.cloudy_night),
        HourlyWeather("22:00", "18°", R.drawable.cloudy_night),
        HourlyWeather("23:00", "16°", R.drawable.rain),
        HourlyWeather("00:00", "17°", R.drawable.cloudy_night),
        HourlyWeather("01:00", "15°", R.drawable.cloudy_night),
        HourlyWeather("02:00", "14°", R.drawable.rain),
        HourlyWeather("03:00", "14°", R.drawable.rain),
        HourlyWeather("04:00", "13°", R.drawable.rain),
        HourlyWeather("05:00", "14°", R.drawable.rain),
        HourlyWeather("06:00", "12°", R.drawable.cloudy_night),
    )

    val getDailyWeather = listOf(
        DailyWeather("Cuma", "26°", R.drawable.sun),
        DailyWeather("Cumartesi", "22°", R.drawable.cloudy),
        DailyWeather("Pazar", "21°", R.drawable.cloudy),
        DailyWeather("Pazartesi", "23°", R.drawable.cloudy),
        DailyWeather("Salı", "20°", R.drawable.clouds),
        DailyWeather("Çarşamba", "15°", R.drawable.rainy),
        DailyWeather("Perşembe", "17°", R.drawable.rainy),
        DailyWeather("Cuma", "18°", R.drawable.rainy),
        DailyWeather("Cumartesi", "22°", R.drawable.clouds),
        DailyWeather("Pazar", "24°", R.drawable.cloudy)
    )
}