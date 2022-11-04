package com.example.nikey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activity_first : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val bt_information = findViewById<Button>(R.id.bt_information)

        // 페이지 이동
        fun moveToAnotherPage(){
            val intent = Intent(this, InformationActivity::class.java)
            startActivity(intent)
        }
        bt_information.setOnClickListener{
            moveToAnotherPage()
        }
    }
}