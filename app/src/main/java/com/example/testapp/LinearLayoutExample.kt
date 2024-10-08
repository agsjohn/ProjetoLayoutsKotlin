package com.example.testapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet.Layout
import com.example.testapp.databinding.LinerLayoutExampleBinding


class LinearLayoutExample: AppCompatActivity() {

    private lateinit var binding: LinerLayoutExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = LinerLayoutExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val button1: Button
        val button2: Button
        val button3: Button
        val button4: Button
        val linearlayout: LinearLayout
        linearlayout = findViewById(R.id.LinearLayout)

        button1 = findViewById(R.id.button1)
        button1.setOnClickListener { // set the color to relative layout
            linearlayout.setBackgroundResource(R.color.green)
        }

        button2 = findViewById(R.id.button2)
        button2.setOnClickListener { // set the color to relative layout
            linearlayout.setBackgroundResource(R.color.blue)
        }

        button3 = findViewById(R.id.button3)
        button3.setOnClickListener { // set the color to relative layout
            linearlayout.setBackgroundResource(R.color.red)
        }

        button4 = findViewById(R.id.button4)
        button4.setOnClickListener { // set the color to relative layout
            linearlayout.setBackgroundResource(R.color.black)
        }
    }
}

