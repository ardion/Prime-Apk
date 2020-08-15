package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        val btnregis= findViewById<TextView>(R.id.btn_regis2)

        btnregis.setOnClickListener {
            val intentregis = Intent(this, registerLayout::class.java)
            startActivity(intentregis)
        }


    }
}