package com.example.job_project.ui.conf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.job_project.R
import com.example.job_project.databinding.ActivitySignInBinding
import com.example.job_project.ui.main.MainActivity

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener {
           Toast.makeText(this,"Click",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,MainActivity::class.java))
        }

        binding.dontHaveAcc.setOnClickListener {
            startActivity(Intent(this,SignUpActivity::class.java))
        }

        binding.fbBtn.setOnClickListener {
            Toast.makeText(this,"Calling Mark Zuckerberg",Toast.LENGTH_LONG).show()
        }
        binding.instBtn.setOnClickListener {
            Toast.makeText(this,"Still calling Mark Zuckerberg",Toast.LENGTH_LONG).show()
        }

    }
}