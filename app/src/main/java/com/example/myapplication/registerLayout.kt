package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class registerLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_layout)

        val btnlogin= findViewById<TextView>(R.id.btn_login)

        btnlogin.setOnClickListener {
            val intenlogin = Intent(this, formActivity::class.java)
            startActivity(intenlogin)
        }

    }
}