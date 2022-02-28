package com.example.menustoolbars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.menustoolbars.databinding.ActivityEj01OptionsMenuBinding

class Ej01OptionsMenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEj01OptionsMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEj01OptionsMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.title="EJERCICIO 1"
        supportActionBar!!.subtitle="Options Menu"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu1,menu)
        menuInflater.inflate(R.menu.menu_add_del, menu)

        return super.onCreateOptionsMenu(menu)
    }
}