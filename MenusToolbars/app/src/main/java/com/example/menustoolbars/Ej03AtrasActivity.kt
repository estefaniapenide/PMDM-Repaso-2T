package com.example.menustoolbars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.menustoolbars.databinding.ActivityEj03AtrasBinding

class Ej03AtrasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEj03AtrasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEj03AtrasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.title="EJERCICIO 3"
        supportActionBar!!.subtitle="Atrás"

        //Se puede hacer así o no poner ni esto, ni usar onBackPressed, si se descomenta los del manifest
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home->{ super.onBackPressed()}
        }
        return super.onOptionsItemSelected(item)
    }


}