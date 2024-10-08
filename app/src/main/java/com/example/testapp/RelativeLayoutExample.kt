package com.example.testapp

import android.R
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.updateLayoutParams
import com.example.testapp.databinding.RelativeLayoutExampleBinding

class RelativeLayoutExample: AppCompatActivity() {

    private lateinit var binding: RelativeLayoutExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = RelativeLayoutExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val botao = binding.button1
        val textView = binding.textView1
        var cont = 0
        botao.setOnClickListener(){
            val params = textView.layoutParams as RelativeLayout.LayoutParams
            if(cont.mod(2).equals(0)) {
                params.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE)
            } else{
                params.removeRule(RelativeLayout.ALIGN_PARENT_TOP)
            }
            cont++
            textView.layoutParams = params
        }
    }
}