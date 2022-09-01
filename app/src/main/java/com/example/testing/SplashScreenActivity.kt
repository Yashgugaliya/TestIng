package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.testing.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {
    internal companion object {
        private const val SPLASH_DELAY = 2000L
    }

    private val handler = Handler()
    private val runnable = Runnable {
        if (!isFinishing) {
            redirect()
        }
    }

    lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        setContentView(binding.root)
        handler.postDelayed(runnable, SPLASH_DELAY)
    }
    private fun redirect() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}