package com.example.fizikazadatak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fizikazadatak.databinding.ActivityMainBinding
import com.example.fizikazadatak.databinding.ActivityZakonocuvanjaenergijegibanjaBinding

class Zakonocuvanjaenergijegibanja : AppCompatActivity() {
    lateinit var binding: ActivityZakonocuvanjaenergijegibanjaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityZakonocuvanjaenergijegibanjaBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.izracunajzakonocuvanja.setOnClickListener{
            val m = binding.unosmase.text.toString().toFloatOrNull()
            val v = binding.unobrzine.text.toString().toFloatOrNull()

            if (m != null && v != null) {
                val e = 0.5 * m * ( v * v )
                binding.rijesenjezakonocuvanja.text = e.toString()
            }
            else
            {
                binding.rijesenjezakonocuvanja.text = "Unesi ispravni broj / neku vrijednost"
            }

        }
    }
}