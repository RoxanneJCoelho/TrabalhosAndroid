package com.example.ex02intent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ex02intent.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private val binding by lazy {
        ActivityMain2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}