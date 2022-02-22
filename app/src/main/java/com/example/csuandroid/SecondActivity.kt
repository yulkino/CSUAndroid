package com.example.csuandroid

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        val textIntent = intent.getStringExtra("KEY")
        val view = findViewById<TextView>(R.id.textTwoView)
        view.text = textIntent
    }
}