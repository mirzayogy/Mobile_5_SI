package com.example.mobile5si

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btHello = findViewById<Button>(R.id.btHello)
        val tvHello = findViewById<TextView>(R.id.tvHello)
        val etHello = findViewById<EditText>(R.id.etHello)

        etHello.requestFocus()

        btHello.setOnClickListener {
            val name = etHello.text.toString()
            tvHello.text = name
            Toast.makeText(this,name,Toast.LENGTH_SHORT).show()
        }
    }
}