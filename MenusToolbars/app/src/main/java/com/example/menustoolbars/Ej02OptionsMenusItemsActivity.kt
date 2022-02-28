package com.example.menustoolbars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.menustoolbars.databinding.ActivityEj02OptionsMenusItemsBinding
import com.google.android.material.snackbar.Snackbar

class Ej02OptionsMenusItemsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEj02OptionsMenusItemsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEj02OptionsMenusItemsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.title="EJERCICIO 2"
        supportActionBar!!.subtitle="Options Menus Items"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu1,menu)
        menuInflater.inflate(R.menu.menu_add_del,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.itemadd->{Snackbar.make(binding.root,"ELEMENTO AÑADIDO",Snackbar.LENGTH_SHORT ).show()}
            R.id.itemdel->{Snackbar.make(binding.root,"ELEMENTO ELIMINADO",Snackbar.LENGTH_SHORT).show()}
            R.id.iteminfo->{Snackbar.make(binding.root,"INFORMACIÓN",Snackbar.LENGTH_SHORT).show()}
            R.id.item1->{ Toast.makeText(this,"ITEM 1",Toast.LENGTH_LONG).show()}
            R.id.item2->{Toast.makeText(this,"ITEM 2",Toast.LENGTH_SHORT).show()}
        }
        return super.onOptionsItemSelected(item)
    }
}