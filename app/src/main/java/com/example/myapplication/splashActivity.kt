package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        layoutid(R.layout.activity_splash)

        var handler=Handler()
        handler.postDelayed({
            val intentt = Intent(this, AppIntroScreen::class.java)
            startActivity(intentt)
            finish()
        }, 3000)

    }


}