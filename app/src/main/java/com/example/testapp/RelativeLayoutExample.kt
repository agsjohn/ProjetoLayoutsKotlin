package com.example.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.RelativeLayoutExampleBinding

class RelativeLayoutExample: AppCompatActivity() {

    private lateinit var binding: RelativeLayoutExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = RelativeLayoutExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}