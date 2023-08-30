package com.example.project1_160420110.view.splashscreen

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import com.example.project1_160420110.databinding.ActivitySplashScreenBinding

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        try {
            YoYo.with(Techniques.BounceInUp)
                .duration(1600)
                .playOn(binding.tvTitle)

            YoYo.with(Techniques.RollIn)
                .duration(1000)
                .playOn(binding.ivLogo)
        }catch (e:Exception){
            finish()
        }
    }
}