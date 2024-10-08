package com.example.testapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.GridLayoutExampleBinding


class GridLayoutExample: AppCompatActivity() {

    private lateinit var binding: GridLayoutExampleBinding

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = GridLayoutExampleBinding.inflate(layoutInflater)
        setContentView(R.layout.grid_layout_example)
    }
}