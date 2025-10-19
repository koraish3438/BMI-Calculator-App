package com.example.bmicalculatorapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_scrren)
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, BmiActivity::class.java)
            startActivity(intent)
        }, 2000)
    }
}