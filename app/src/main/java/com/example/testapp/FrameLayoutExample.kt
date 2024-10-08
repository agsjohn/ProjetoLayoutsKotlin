package com.example.testapp

import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import kotlin.random.Random
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.FrameLayoutExampleBinding

class FrameLayoutExample: AppCompatActivity() {

    private lateinit var binding: FrameLayoutExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FrameLayoutExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var button: Button
        button = findViewById(R.id.button)
        var cont = 1
        val FrameLayout: FrameLayout
        FrameLayout = findViewById(R.id.Framelayout)

        var imageView: ImageView
        imageView = findViewById(R.id.imageView)
        button.setOnClickListener {
            when(cont){
                1 -> imageView.setImageResource(R.drawable.fundo1)
                2 -> imageView.setImageResource(R.drawable.fundo2)
                3 -> imageView.setImageResource(R.drawable.fundo3)
                4 -> imageView.setImageResource(R.drawable.fundo4)
                5 -> imageView.setImageResource(R.drawable.fundo5)
                6 -> imageView.setImageResource(R.drawable.fundo6)
                7 -> imageView.setImageResource(R.drawable.fundo7)
                8 -> imageView.setImageResource(R.drawable.fundo8)
            }
            if (cont == 8){
                cont = 0
            }
            cont++
        }
    }
}