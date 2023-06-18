package com.example.weatherapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weatherapp.model.DayItem
import com.example.weatherapp.model.WeatherModel

class MainViewModel:ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val LiveDataList = MutableLiveData<List<WeatherModel>>()
}