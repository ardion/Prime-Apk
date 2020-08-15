package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class profilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        val name = intent.getStringExtra("Name")
        val sex = intent.getStringExtra("Sex")
        val job = intent.getStringExtra("Job")
        val number = intent.getStringExtra("Number")
        val bd = intent.getStringExtra("Bdate")
        val bp = intent.getStringExtra("Bplace")
        val adr = intent.getStringExtra("Adress")


        val resultTv = findViewById<TextView>(R.id.profil_name)
        resultTv.text = "$name"
        val resultsex = findViewById<TextView>(R.id.profil_sex)
        resultsex.text = "$sex"
        val resultjob = findViewById<TextView>(R.id.profil_job)
        resultjob.text = "$job"

        val resultNumber = findViewById<TextView>(R.id.profil_number)
        resultNumber.text = "$number"
        val resultbd = findViewById<TextView>(R.id.profil_birthdate)
        resultbd.text = "$bd"
        val resultbp = findViewById<TextView>(R.id.profil_birthplace)
        resultbp.text = "$bp"
        val resultadrs = findViewById<TextView>(R.id.profil_address)
        resultadrs.text = "$adr"
    }
}