package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.buttonReal.setOnClickListener {
            var valorInput = binding.editValor.text.toString().toDouble()
            var valorReal = valorInput * 4.4;

            Toast.makeText(applicationContext, "Valor em real: $valorReal", Toast.LENGTH_SHORT).show()

        }

        binding.buttonDolar.setOnClickListener {
            var valorInput = binding.editValor.text.toString().toDouble()
            var valorDolar = valorInput * 1.2;

            Toast.makeText(applicationContext, "Valor em dólar: $valorDolar", Toast.LENGTH_SHORT).show()

        }

        binding.buttonPeso.setOnClickListener {
            var valorInput = binding.editValor.text.toString().toDouble()
            var valorPeso = valorInput * 31.5;

            Toast.makeText(applicationContext, "Valor em peso: $valorPeso", Toast.LENGTH_SHORT).show()

        }

    }
}