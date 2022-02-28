package com.example.fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener { startActivity(Intent(this,Ej01FragmentsEstaticosActivity::class.java)) }
        binding.button2.setOnClickListener { startActivity(Intent(this,Ej02FragmentsDinamicosActivity::class.java)) }
    }
}