package com.example.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.ScrollviewExampleBinding

class ScrollViewExample: AppCompatActivity() {

    private lateinit var binding: ScrollviewExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ScrollviewExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}