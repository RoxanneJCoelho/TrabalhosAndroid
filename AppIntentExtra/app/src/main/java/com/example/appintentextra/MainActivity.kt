package com.example.appintentextra

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appintentextra.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.buttonAvancarOpcao1.setOnClickListener {

            var nomeUtilizador = binding.editNomeUtilizador.text.toString()
            var idadeUtilizador = binding.editIdadeUtilizador.text.toString()

            var intentTop = Intent(this, OpcaoUmActivity::class.java)

            intentTop.putExtra("nome", nomeUtilizador)
            intentTop.putExtra("idade", idadeUtilizador)


            startActivity(intentTop)


        }

        binding.buttonAvancarOpcao2.setOnClickListener {

            var nomeUtilizador = binding.editNomeUtilizador.text.toString()
            var idadeUtilizador = binding.editIdadeUtilizador.text.toString()

            var intentTop = Intent(this, OpcaoDoisActivity::class.java)

            intentTop.putExtra("nome", nomeUtilizador)
            intentTop.putExtra("idade", idadeUtilizador)

            startActivity(intentTop)


        }

    }
}