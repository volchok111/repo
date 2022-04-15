package com.example.job_project.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.job_project.R
import com.example.job_project.ui.conf.SignInActivity
import com.example.job_project.ui.main.MainActivity
import com.example.job_project.util.AppPreferences

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val token = AppPreferences.token

        if (token == null) {
            startActivity(Intent(this, SignInActivity::class.java))
            finish()
        }
        else{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}