package com.example.drawable2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.drawable2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)


        b.bNavView.setOnItemSelectedListener { item ->
            when (item.itemId){
                R.id.bInicio -> {
                    Navigation.findNavController(b.fragmentContainerView2  )
                        .navigate(R.id.fristFrag)
                    true
                }
                R.id.bProfile -> {
                    findNavController(R.id.fragmentContainerView2)
                        .navigate(R.id.secondFrag)
                    true
                }
                R.id.bSetting -> {
                    b.fragmentContainerView2.findNavController()
                        .navigate(R.id.thirdFrag)
                    true
                }
                else -> false
            }
        }
    }
}
