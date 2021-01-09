package com.example.mobile5si

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MahasiswaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mahasiswa)

        val btBukaActivity = findViewById<Button>(R.id.btBukaActivity)
        val et_npm = findViewById<EditText>(R.id.et_npm)
        val et_nama = findViewById<EditText>(R.id.et_nama)
        val et_ipk = findViewById<EditText>(R.id.et_ipk)
        val et_jumlah = findViewById<EditText>(R.id.et_jumlah)

        btBukaActivity.setOnClickListener {
            val npm = et_npm.text.toString()
            val nama = et_nama.text.toString()
            val ipk = et_ipk.text.toString()
            val jumlah = et_jumlah.text.toString()

            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra("npm",npm)
            intent.putExtra("nama",nama)
            intent.putExtra("jumlah",jumlah)
            intent.putExtra("ipk",ipk)
            startActivity(intent)
        }
    }
}