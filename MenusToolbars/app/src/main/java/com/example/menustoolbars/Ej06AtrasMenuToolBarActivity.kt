package com.example.menustoolbars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.menustoolbars.databinding.ActivityEj06AtrasMenuToolBarBinding
import com.google.android.material.snackbar.Snackbar

class Ej06AtrasMenuToolBarActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEj06AtrasMenuToolBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEj06AtrasMenuToolBarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar2)
        supportActionBar!!.title="EJERCICIO 6"
        supportActionBar!!.subtitle="Atras Menú y Toolbar"

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_add_del,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.itemadd,R.id.itemdel->{Snackbar.make(binding.root,item.title,Snackbar.LENGTH_SHORT).show()}
            android.R.id.home->{super.onBackPressed()}
        }
        return super.onOptionsItemSelected(item)
    }
}