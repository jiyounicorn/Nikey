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
        val bt_dictionary = findViewById<Button>(R.id.bt_dictionary)
        val bt_keyboard_setting = findViewById<Button>(R.id.bt_keyboard_setting)
//        val bt_keyboard_setting = findViewById<Button>(R.id.bt_keyboard_setting)

        // 페이지 이동
        fun moveToInformationPage(){
            val intent = Intent(this, InformationActivity::class.java)
            startActivity(intent)
        }
        fun moveToDictionaryPage(){
            val intent = Intent(this, DictionaryActivity::class.java)
            startActivity(intent)
        }
        fun moveToKeyboardSettingPage(){
            val intent = Intent(this, ThemaView::class.java)
            startActivity(intent)
        }
//        fun moveToKeyboardSettingPage(){
//            val intent = Intent(this, KeyboardSettingActivity::class.java)
//            startActivity(intent)
//        }
        bt_information.setOnClickListener{
            moveToInformationPage()
        }
        bt_dictionary.setOnClickListener{
            moveToDictionaryPage()
        }
        bt_keyboard_setting.setOnClickListener{
            moveToKeyboardSettingPage()
        }
//        bt_keyboard_setting.setOnClickListener{
//            moveToKeyboardSettingPage()
//        }
    }
}