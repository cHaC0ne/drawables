package com.example.drawable2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import com.example.drawable2.databinding.ActivityMainBinding
import com.example.drawable2.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var b: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(b.root)
//        b.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
//            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
//                b.tvSeekBar.text = seek.progress.toString().plus("/100")
//
//            }
//
//            override fun onStartTrackingTouch(p0: SeekBar?) {
//                TODO("Not yet implemented")
//            }
//
//            override fun onStopTrackingTouch(p0: SeekBar?) {
//                TODO("Not yet implemented")
//            }
//        })

    }

}
