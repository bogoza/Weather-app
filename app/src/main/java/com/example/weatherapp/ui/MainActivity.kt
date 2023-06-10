package com.example.weatherapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.weatherapp.R
import com.example.weatherapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHosTFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHosTFragment.navController



        navController.navigate(R.id.mainFragment)


    }


}
