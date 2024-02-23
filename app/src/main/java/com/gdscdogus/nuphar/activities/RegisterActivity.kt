package com.gdscdogus.nuphar.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gdscdogus.nuphar.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}