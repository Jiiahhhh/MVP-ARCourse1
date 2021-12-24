package com.example.mvp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        val score=intent.getStringExtra(setData.score)
        val totalQuestion=intent.getStringExtra("Total Size")

        selamat.text="Selamat kamu mendapatkan koin ${score}*10"
        Score.text="${score}/${totalQuestion}"
        btn_selesai.setOnClickListener{
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }
    }
}