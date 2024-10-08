package com.gv.fooddelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gv.fooddelivery.databinding.ActivityLoginUserBinding

class LoginUserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.goSignUpUser.setOnClickListener{
            val intent= Intent(this@LoginUserActivity,SingUpUserActivity::class.java)
            startActivity(intent)

        }
        binding.button3.setOnClickListener{
            val intent=Intent(this@LoginUserActivity,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}