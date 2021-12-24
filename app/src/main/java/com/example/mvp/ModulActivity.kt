package com.example.mvp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_modul.*
import kotlinx.android.synthetic.main.activity_modul_reward.*

class ModulActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modul)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        btn_modul.setOnClickListener{
            var intent = Intent(this, ModulReward::class.java)
            startActivity(intent)

            finish()
        }
    }
}