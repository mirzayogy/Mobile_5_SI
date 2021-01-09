package com.example.mobile5si

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val bt_kembali = findViewById<Button>(R.id.bt_kembali)

        val tv_nama = findViewById<TextView>(R.id.tv_nama)
        val tv_npm = findViewById<TextView>(R.id.tv_npm)
        val tv_ipk = findViewById<TextView>(R.id.tv_ipk)
        val tv_jumlah = findViewById<TextView>(R.id.tv_jumlah)

        val npm = intent.getStringExtra("npm")
        val nama = intent.getStringExtra("nama")
        val jumlah = intent.getStringExtra("jumlah")
        val ipk = intent.getStringExtra("ipk")

        tv_npm.text = npm
        tv_nama.text = nama
        tv_jumlah.text = jumlah
        tv_ipk.text = ipk

        bt_kembali.setOnClickListener {
            finish()
        }
    }
}