package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class formActivity : BaseActivity() {

    var nameEt: TextView? = null
    var sexEt: TextView? = null
    var jobEt: TextView? = null
    var numberEt: TextView? = null
    var bdEt: TextView? = null
    var bpEt: TextView? = null
    var adrEt: TextView? = null
    var saveBtn: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        layoutid(R.layout.activity_form)
        findviews()
        initlisteners()
    }


    override fun findviews() {
        nameEt = findViewById(R.id.et_name)
        sexEt = findViewById(R.id.et_sex)
        jobEt = findViewById(R.id.et_job)
        numberEt = findViewById(R.id.et_HP)
        bdEt = findViewById(R.id.et_BD)
        bpEt = findViewById(R.id.et_BP)
        adrEt = findViewById(R.id.et_address)
        saveBtn = findViewById(R.id.btnSave)
    }


    override fun initlisteners() {
        saveBtn?.setOnClickListener {

            val name = nameEt?.text.toString()
            val sex = sexEt?.text.toString()
            val job = jobEt?.text.toString()
            val number = numberEt?.text.toString()
            val bd = bdEt?.text.toString()
            val bp = bpEt?.text.toString()
            val adr = adrEt?.text.toString()


            inten<profilActivity>(this)
            putextra("Name",name)
            putextra("Sex", sex)
            putextra("Job", job)
            putextra("Number", number)
            putextra("Bdate", bd)
            putextra("Bplace", bp)
            putextra("Adress", adr)
            startActivity(start)


        }
    }

}
