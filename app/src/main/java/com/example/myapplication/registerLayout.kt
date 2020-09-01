package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class registerLayout : BaseActivity() {
    var btnsignup: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        layoutid(R.layout.activity_register_layout)
        findviews()
        initlisteners()
    }

    override fun findviews() {
        btnsignup = findViewById(R.id.btn_signup)
    }

    override fun initlisteners() {
        btnsignup?.setOnClickListener {
            val intenp = Intent(this, formActivity::class.java)
            startActivity(intenp)
        }
    }
}