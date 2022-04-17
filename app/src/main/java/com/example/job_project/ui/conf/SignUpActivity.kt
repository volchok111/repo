package com.example.job_project.ui.conf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.job_project.R
import com.example.job_project.databinding.ActivitySignUpBinding
import com.example.job_project.model.Lead
import io.reactivex.disposables.Disposable

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signUpBtn.setOnClickListener {

            val name = binding.nameEdt.text.toString()
            val password = binding.passwordEdt.text.toString()
            val repeatPassword = binding.passwordRepEdt.text.toString()
            val email = binding.emailEdt.text.toString()
            val username = binding.usernameEdt.text.toString()

            if(valid(name,password,repeatPassword,email)){

                /**
                 *  Internet request , if everything is OK(unfinished)
                 */
                val lead = Lead(
                    name = name,
                    password = password,
                    username = username,
                    email = email
                )
            }
        }
    }
    private fun valid(
        name: String,
        password: String,
        repeatPassword: String,
        email: String
    ): Boolean {
        if (!name.matches(Regex("[a-zA-Z]+\$")) ||
            !email.matches(Regex("[a-zA-Z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}")) ||
            password != repeatPassword
        ) {
            binding.progressPb.visibility = View.INVISIBLE
            Toast.makeText(this,"Error, incorrect field",Toast.LENGTH_LONG).show()
            return false
        }
        return true
    }
}