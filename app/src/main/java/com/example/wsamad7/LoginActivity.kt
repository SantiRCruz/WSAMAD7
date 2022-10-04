package com.example.wsamad7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wsamad7.databinding.ActivityHomeBinding
import com.example.wsamad7.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.supportActionBar?.hide()



    }

}