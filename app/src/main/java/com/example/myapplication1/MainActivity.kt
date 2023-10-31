package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signup1= findViewById<Button>(R.id.button)
        val login1= findViewById<Button>(R.id.button2)
        signup1.setOnClickListener {
            val intent=Intent(this, signup::class.java)
            startActivity(intent)
        }
        login1.setOnClickListener {
            val intent=Intent(this, login::class.java)
            startActivity(intent)
        }
    }
}