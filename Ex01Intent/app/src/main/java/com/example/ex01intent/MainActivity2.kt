package com.example.ex01intent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ex01intent.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private val binding by lazy {
        ActivityMain2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val i = intent

        var nomeInformacao = i.extras?.getString("nome")
        var moradaInformacao = i.extras?.getString("morada")
        var telefoneInformacao = i.extras?.getInt("telefone")
        var emailInformacao = i.extras?.getString("email")

        binding.textoFrase.text = "$nomeInformacao vive na $moradaInformacao, tem o telefone $telefoneInformacao e o email é $emailInformacao."



    }





}