package com.example.testapp

import android.R.string
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.ScrollviewExampleBinding

class ScrollViewExample: AppCompatActivity() {

    private lateinit var binding: ScrollviewExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ScrollviewExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener(){
            binding.text1.setText(R.string.LoremIpsum)
        }
        binding.button2.setOnClickListener(){
            binding.text2.setText(R.string.LoremIpsum)
        }
        binding.button3.setOnClickListener(){
            binding.text3.setText(R.string.LoremIpsum)
        }
        binding.button4.setOnClickListener(){
            binding.text4.setText(R.string.LoremIpsum)
        }
        binding.button5.setOnClickListener(){
            binding.text5.setText(R.string.LoremIpsum)
        }
        binding.button6.setOnClickListener(){
            binding.text6.setText(R.string.LoremIpsum)
        }
        binding.button7.setOnClickListener(){
            binding.text7.setText(R.string.LoremIpsum)
        }
        binding.button8.setOnClickListener(){
            binding.text8.setText(R.string.LoremIpsum)
        }
        binding.button9.setOnClickListener(){
            binding.text9.setText(R.string.LoremIpsum)
        }
    }
}