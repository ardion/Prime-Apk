package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splashActivity : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        handler= Handler()
        handler.postDelayed({
            val intentt = Intent(this, AppIntroScreen::class.java)
            startActivity(intentt)
            finish()
        }, 3000)

    }
}