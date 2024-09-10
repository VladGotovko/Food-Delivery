package com.gv.fooddelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplachActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splach)
Handler().postDelayed({
    val intent = Intent(this@SplachActivity,StartActivity::class.java)
    startActivity(intent)
    finish()
}, 3000)

}}