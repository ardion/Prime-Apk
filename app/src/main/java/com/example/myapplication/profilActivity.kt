package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class profilActivity : BaseActivity() {

    var resultTv: TextView? = null
    var resultSex: TextView? = null
    var resultJob: TextView? = null
    var resultNumber: TextView? = null
    var resultbd: TextView? = null
    var resultbp: TextView? = null
    var resultadrs: TextView? = null

    var name:String?=null
    var sex:String?=null
    var job:String?=null
    var number:String?=null
    var bd:String?=null
    var bp:String?=null
    var adr:String?=null


            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        layoutid(R.layout.activity_profil)
        get()
        findviews()
        initlisteners()

    }

    override fun get() {
        name = intent.getStringExtra("Name")
        sex = intent.getStringExtra("Sex")
        job = intent.getStringExtra("Job")
        number = intent.getStringExtra("Number")
        bd = intent.getStringExtra("Bdate")
        bp = intent.getStringExtra("Bplace")
        adr = intent.getStringExtra("Adress")

    }

    override fun findviews() {
        resultTv = findViewById(R.id.profil_name)
        resultTv?.text="$name"
        resultSex = findViewById(R.id.profil_sex)
        resultSex?.text = "$sex"
        resultJob = findViewById(R.id.profil_job)
        resultJob?.text = "$job"
        resultNumber = findViewById(R.id.profil_number)
        resultNumber?.text = "$number"
        resultbd = findViewById(R.id.profil_birthdate)
        resultbd?.text = "$bd"
        resultbp = findViewById(R.id.profil_birthplace)
        resultbp?.text = "$bp"
        resultadrs = findViewById(R.id.profil_address)
        resultadrs?.text = "$adr"


    }

}