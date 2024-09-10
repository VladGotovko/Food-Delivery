package com.gv.fooddelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gv.fooddelivery.databinding.ActivitySingUpUserBinding
import com.gv.fooddelivery.LoginUserActivity as LoginUserActivity1

lateinit var binding: ActivitySingUpUserBinding
class SingUpUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySingUpUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.goLoginUserPage.setOnClickListener{
            val intent= Intent( this@SingUpUserActivity, LoginUserActivity1::class.java)
            startActivity(intent)

        }
        binding.button3.setOnClickListener{
            val intent=Intent(this@SingUpUserActivity,LocationActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}