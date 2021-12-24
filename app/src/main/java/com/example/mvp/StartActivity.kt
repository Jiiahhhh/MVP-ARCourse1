package com.example.mvp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        btn_signup.setOnClickListener {
            var intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)

            finish()
        }
        btn_login.setOnClickListener {
            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

            finish()
        }
    }
}