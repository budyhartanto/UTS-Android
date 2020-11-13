package com.satria.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.activity_kalkulator.*

class KalkulatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)


        val angkaPertama = findViewById<EditText>(R.id.edtAngka1)
        val angkaKedua = findViewById<EditText>(R.id.edtAngka2)
        val hasil = findViewById<TextView>(R.id.edtHasil)

        val pengurangan = angkaPertama.text.toString().toDouble()-angkaKedua.text.toString().toDouble()
        hasil.text = pengurangan.toString()

        btnKeluar.setOnClickListener({
            startActivity(Intent(this, MainActivity::class.java))
        })
    }
}