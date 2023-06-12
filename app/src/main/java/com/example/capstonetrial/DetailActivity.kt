package com.example.capstonetrial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.capstonetrial.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}