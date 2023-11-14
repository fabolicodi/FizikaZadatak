package com.example.fizikazadatak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fizikazadatak.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.zakonocuvanja.setOnClickListener{
            Intent(this, Zakonocuvanjaenergijegibanja::class.java).also{ startActivity(it) }
        }
        binding.snagairad.setOnClickListener{
            Intent(this,  Snagairad::class.java).also{ startActivity(it) }
        }
    }

}