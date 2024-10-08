package com.example.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.CoordinatorLayoutExampleBinding

class CoordinatorLayoutExample: AppCompatActivity() {

    private lateinit var binding: CoordinatorLayoutExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = CoordinatorLayoutExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}