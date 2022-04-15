package com.example.job_project.ui.conf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.job_project.R
import com.example.job_project.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
    }
}