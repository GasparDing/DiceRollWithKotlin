package com.example.androiddojowithkotlin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.view.*

// 父類別提供Android 的基本功能，AppCompatActivity 支援較廣
class MainActivity : AppCompatActivity() {

    // lateinit: 告訴編譯器，有人呼叫到該宣告的屬性，再進行初始化
    lateinit var rollButton: Button
    lateinit var diceImage: ImageView

    // event 註冊在onCreate 方法內
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton = findViewById(R.id.roll_button)
        diceImage = findViewById(R.id.dice_image)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice(){
        val resource = when((1..6).random()){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(resource)
    }
}
