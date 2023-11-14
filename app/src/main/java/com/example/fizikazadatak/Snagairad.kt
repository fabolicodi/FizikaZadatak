package com.example.fizikazadatak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fizikazadatak.databinding.ActivitySnagairadBinding
import com.example.fizikazadatak.databinding.ActivityZakonocuvanjaenergijegibanjaBinding

class Snagairad : AppCompatActivity() {
    lateinit var binding: ActivitySnagairadBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySnagairadBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.izrcunajsilaigibanje.setOnClickListener{
            val F = binding.unossile.text.toString().toFloatOrNull()
            val d = binding.unosputa.text.toString().toFloatOrNull()

            if (d != null && F != null) {
                val W = F * d
                binding.rezultatsnagaigibanje.text = W.toString()
            }
            else
            {
                binding.rezultatsnagaigibanje.text = "Unesi broj / neku vrijednost"
            }

        }
    }
}