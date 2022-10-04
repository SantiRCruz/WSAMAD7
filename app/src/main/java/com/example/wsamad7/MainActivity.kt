package com.example.wsamad7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wsamad7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.supportActionBar?.hide()

        animations()

    }

    private fun animations() {
        binding.logo.animate().translationY(-300f).scaleX(0f).scaleY(0f).setDuration(0)
            .withEndAction {
                binding.logoName.animate().translationY(-100f).scaleX(0f).scaleY(0f).setDuration(0)
                    .withEndAction {
                        binding.logo.animate().translationY(0f).scaleX(1f).scaleY(1f).setDuration(200).withEndAction {
                            binding.logoName.animate().translationY(1f).scaleX(1f).scaleY(1f).setDuration(200).withEndAction {
                                val i = Intent(this@MainActivity,LoginActivity::class.java)
                                startActivity(i)
                                finish()
                            }
                        }
                    }
            }
    }

}