package com.example.androiddojowithkotlin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.view.*

// 父類別提供Android 的基本功能，AppCompatActivity 支援較廣
class MainActivity : AppCompatActivity() {

    // event 註冊在onCreate 方法內
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice(){
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = (5..9).random().toString()
        //Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
    }
}
