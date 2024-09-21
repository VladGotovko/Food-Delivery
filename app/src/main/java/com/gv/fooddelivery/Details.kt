package com.gv.fooddelivery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gv.fooddelivery.databinding.ActivityDetails2Binding
import com.gv.fooddelivery.databinding.ActivityDetailsBinding

class Details : AppCompatActivity() {
    private lateinit var binding: ActivityDetails2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetails2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backStack.setOnClickListener {
            onBackPressed()
        }
        binding.placeMyOrder.setOnClickListener {
            val bottomFragment = SuccessPayment()
            bottomFragment.show(supportFragmentManager, "Test")
        }

        val totalPrice = intent.getStringExtra("totalPrice")
        binding.price.text = totalPrice
    }
}