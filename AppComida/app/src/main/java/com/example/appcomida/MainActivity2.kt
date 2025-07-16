package com.example.appcomida

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appcomida.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



    }
}