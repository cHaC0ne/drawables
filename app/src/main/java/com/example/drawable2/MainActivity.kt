package com.example.drawable2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.drawable2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)


        b.bNavView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bInicio -> {
//                    supportFragmentManager.findFragmentById(androidx.navigation.fragment.R.id.nav_host_fragment_container) as  NavHostFragment
//                    val navController = NavHostFragment.findNavController(n)
                    Navigation.findNavController(b.fragmentContainerView2)
                        .navigate(R.id.fristFrag)
                    true

                }
                R.id.bProfile -> {
                    Navigation.findNavController(b.fragmentContainerView2)
                        .navigate(R.id.thirdFrag)
                    true
                }
                R.id.bSetting -> {
                    Navigation.findNavController(b.fragmentContainerView2)
                        .navigate(R.id.secondFrag)
                    true
                }
                else -> false
            }
        }

    }
}

