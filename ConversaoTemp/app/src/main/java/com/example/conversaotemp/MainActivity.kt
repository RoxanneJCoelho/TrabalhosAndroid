package com.example.conversaotemp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.conversaotemp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.botaoConverter.setOnClickListener {
            val celsius = binding.textoConversao.text.toString().toDouble()
            val fahrenheit = celsius * 1.8 + 32
            binding.texto.text = String.format("%.2f graus Celsius é: %.2f graus Fahrenheit", celsius, fahrenheit)
        }
    }
}