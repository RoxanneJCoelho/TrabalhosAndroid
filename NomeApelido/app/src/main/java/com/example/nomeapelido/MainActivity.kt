package com.example.nomeapelido

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.nomeapelido.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            var nome : String = binding.editNome.text.toString()
            var apelido : String = binding.editApelido.text.toString()
            binding.texto.text ="Olá $nome $apelido"
        }

    }
}