package com.example.csuandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view = findViewById<TextView>(R.id.textView)
        view.text = "Можно нормально пушить на гит?!"
        val student = Student("Vitaliy", 4)
        view.text = student.toString()
        val secondButton = findViewById<TextView>(R.id.secondButton)
        secondButton.setOnClickListener {
            val sendIntent = Intent(this, SecondActivity::class.java).apply {
                putExtra("KEY", "TestText")
            }
            startActivity(sendIntent)
        }
    }
}