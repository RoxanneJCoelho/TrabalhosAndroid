package com.example.appcomida

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.appcomida.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener {

            var usernameInput = binding.editUsername.text.toString()
            var passwordInput = binding.editPassword.text.toString()

            binding.editUsername.setText("")
            binding.editPassword.setText("")

            if (usernameInput.equals("user") && passwordInput.equals("pass")) { // LOGIN VÁLIDO

                val intent = Intent(this,MainActivity2::class.java)
                startActivity(intent)

            } else { // LOGIN INVÁLIDO
                Toast.makeText(applicationContext, "Credenciais inválidas", Toast.LENGTH_SHORT)
                    .show()
            }

        }

    }
}