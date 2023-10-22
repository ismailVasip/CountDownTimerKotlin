package com.example.countdowntimerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.countdowntimerkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //public abstract class CountDownTimer

        object : CountDownTimer(10000,1000){
            override fun onTick(millisUntilFinished: Long) {
                binding.text.text = "Left: ${millisUntilFinished / 1000}"
            }

            override fun onFinish() {
                binding.text.text = "Left: 0"
            }

        }.start()
    }
}