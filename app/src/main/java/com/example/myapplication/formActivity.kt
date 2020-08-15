package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class formActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)


        val nameEt= findViewById<TextView>(R.id.et_name)
        val sexEt= findViewById<TextView>(R.id.et_sex)
        val jobEt=findViewById<TextView>(R.id.et_job)

        val numberEt= findViewById<TextView>(R.id.et_HP)
        val bdEt= findViewById<TextView>(R.id.et_BD)
        val bpEt=findViewById<TextView>(R.id.et_BP)
        val adrEt=findViewById<TextView>(R.id.et_address)
        val saveBtn=findViewById<TextView>(R.id.btnSave)


        saveBtn.setOnClickListener {
            //get text from edittexts
            val name = nameEt.text.toString()
            val sex = sexEt.text.toString()
            val job = jobEt.text.toString()
            val number = numberEt.text.toString()
            val bd = bdEt.text.toString()
            val bp = bpEt.text.toString()
            val adr = adrEt.text.toString()


            //intent to start activity

            val intent = Intent(this, profilActivity::class.java)
            intent.putExtra("Name", "$name")
            intent.putExtra("Sex", sex)
            intent.putExtra("Job", job)
            intent.putExtra("Number", number)
            intent.putExtra("Bdate", bd)
            intent.putExtra("Bplace", bp)
            intent.putExtra("Adress", adr)
            startActivity(intent)


            //intent to start activity
        }
    }
}