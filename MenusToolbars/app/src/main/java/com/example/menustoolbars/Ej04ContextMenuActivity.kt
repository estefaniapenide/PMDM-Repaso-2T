package com.example.menustoolbars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.menustoolbars.databinding.ActivityEj04ContextMenuBinding
import com.google.android.material.snackbar.Snackbar

class Ej04ContextMenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEj04ContextMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEj04ContextMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.title="EJERCICIO 4"
        supportActionBar!!.subtitle="Context Menu"

        binding.textView1.setOnClickListener { clicNormal() }
        binding.textView2.setOnClickListener { clicNormal() }

        registerForContextMenu(binding.textView1)
        registerForContextMenu(binding.textView2)
    }

    fun clicNormal(){
        Toast.makeText(this, "MANTÉN MÁS TIEMPO PULSADO",Toast.LENGTH_SHORT).show()
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        when (v) {
            binding.textView1 -> {
                menuInflater.inflate(R.menu.menucontextual1, menu)
                menu!!.setHeaderTitle("Menú contextual 1")
            }
            binding.textView2 -> {
                menuInflater.inflate(R.menu.menucontextual2,menu)
                menu!!.setHeaderTitle("Menú contextual 2")
            }
        }
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.itemcontxadd,R.id.itemcontxdel,R.id.itemcontxsend,R.id.itemcontxshare->{Snackbar.make(binding.root,item.title,Snackbar.LENGTH_SHORT).show()}
        }
        return super.onContextItemSelected(item)
    }
}