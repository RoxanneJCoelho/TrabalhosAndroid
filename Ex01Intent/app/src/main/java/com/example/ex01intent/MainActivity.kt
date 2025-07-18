package com.example.ex01intent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ex01intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener {

            var nomeUtilizador = binding.editNome.text.toString()
            var moradaUtilizador = binding.editMorada.text.toString()
            var telefoneUtilizador = binding.editTelefone.text.toString().toInt()
            var emailUtilizador = binding.editEmail.text.toString()

            var intentTop = Intent(this, MainActivity2::class.java)

            intentTop.putExtra("nome", nomeUtilizador)
            intentTop.putExtra("morada", moradaUtilizador)
            intentTop.putExtra("telefone", telefoneUtilizador)
            intentTop.putExtra("email", emailUtilizador)

            startActivity(intentTop)
        }
    }
}