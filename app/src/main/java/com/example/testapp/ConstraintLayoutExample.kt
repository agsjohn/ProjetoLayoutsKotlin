package com.example.testapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.ConstraintLayoutExampleBinding


class ConstraintLayoutExample: AppCompatActivity() {

    private lateinit var binding: ConstraintLayoutExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ConstraintLayoutExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btn = findViewById<View>(R.id.button1) as Button
        val textView = findViewById<View>(R.id.textView1) as TextView
        var count = 1

        btn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                textView.setText("Contador de cliques: " + count++)
            }
        })
    }
}