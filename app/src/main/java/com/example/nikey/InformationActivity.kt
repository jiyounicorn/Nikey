package com.example.nikey

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.nikey.databinding.ActivityInformationBinding

class InformationActivity : AppCompatActivity() {
    lateinit var binding: ActivityInformationBinding

    val negativeButtonClick={ diaIogInterface: DialogInterface, i: Int ->
        toast("취소")
    }
    val positiveButtonClick={ dialogInterface: DialogInterface, i: Int ->
        toast("탈퇴되었습니다. 이용해주셔서 감사합니다 :)")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBasicAlertDialog.setOnClickListener{
            val builder= AlertDialog.Builder(this)
                .setMessage("탈퇴하기 버튼을 누르면 NI:KEY의 모든 정보가 즉시 삭제되며, 복구할 수 없습니다. 정말로 탈퇴하시겠습니까?")
                .setNegativeButton("취소",negativeButtonClick)
                .setPositiveButton("탈퇴",positiveButtonClick)
                .show()
        }
    }

    fun toast(message:String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}