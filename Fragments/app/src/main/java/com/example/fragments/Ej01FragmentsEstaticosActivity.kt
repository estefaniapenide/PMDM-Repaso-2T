package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragments.databinding.ActivityEj01FragmentsEstaticosBinding

class Ej01FragmentsEstaticosActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityEj01FragmentsEstaticosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEj01FragmentsEstaticosBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}