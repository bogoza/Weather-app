package com.example.weatherapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherapp.R
import com.example.weatherapp.adapters.WeatherAdapter
import com.example.weatherapp.databinding.FragmentHoursBinding
import com.example.weatherapp.databinding.FragmentMainBinding
import com.example.weatherapp.model.WeatherModel


class HoursFragment : Fragment() {

    private var _binding:FragmentHoursBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter:WeatherAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHoursBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRcView()
    }

    private fun initRcView() = with(binding){
        rcView.layoutManager = LinearLayoutManager(activity)
        adapter = WeatherAdapter()
        rcView.adapter= adapter
        val list = listOf(
            WeatherModel("","12:00","Sunny","25º","","","",""),
            WeatherModel("","13:00","Sunny","25º","","","",""),
            WeatherModel("","14:00","Sunny","35º","","","","")
        )
        adapter.submitList(list)
    }
    companion object{
        @JvmStatic
        fun newInstance() = HoursFragment()
    }
}