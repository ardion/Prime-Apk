package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class login : BaseActivity() {
    var btnregis:TextView?=null
    var btnfr:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        layoutid(R.layout.activity_login2)
        findviews()
        initlisteners()
    }
    override fun findviews() {
        btnregis=findViewById(R.id.tv_regis2)
        btnfr= findViewById(R.id.btn_login)
    }


    override fun initlisteners() {
        btnregis?.setOnClickListener {
            val intentregis = Intent(this, registerLayout::class.java)
            startActivity(intentregis)
        }


        btnfr?.setOnClickListener {
            val intentform = Intent(this, formActivity::class.java)
            startActivity(intentform)
        }


    }


}
