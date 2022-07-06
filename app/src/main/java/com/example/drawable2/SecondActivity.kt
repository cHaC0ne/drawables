package com.example.drawable2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.drawable2.databinding.ActivityMainBinding
import com.example.drawable2.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var b: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(b.root)

//        b.bVolver.setOnClickListener {
//            onBackPressed()
//        }
        b.bBoton.setOnClickListener {
            val secondIntent = Intent(this,ThirdActivity::class.java)
            startActivity(secondIntent)
        }
    }
}
