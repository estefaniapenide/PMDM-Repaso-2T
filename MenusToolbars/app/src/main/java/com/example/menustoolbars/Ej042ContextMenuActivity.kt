package com.example.menustoolbars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.menustoolbars.databinding.ActivityEj042ContextMenuBinding

class Ej042ContextMenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEj042ContextMenuBinding
    private lateinit var vistaActual: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEj042ContextMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.title="EJERCICIO 4_2"
        supportActionBar!!.subtitle="Contex Menu Único"

        binding.view1.setOnClickListener { clicNormal() }
        binding.view2.setOnClickListener { clicNormal() }

        registerForContextMenu(binding.view1)
        registerForContextMenu(binding.view2)
    }

    fun clicNormal(){
        Toast.makeText(this,"Mantén pulsado durante más tiempo",Toast.LENGTH_SHORT).show()
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        vistaActual = v!!
        menuInflater.inflate(R.menu.menucontextualunico, menu)
        menu!!.setHeaderTitle("MENÚ ÚNICO")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.itemeliminar->{
                when(vistaActual){
                    binding.view1->{binding.tv1.visibility=View.INVISIBLE}
                    binding.view2->{binding.tv2.visibility=View.INVISIBLE}
                }
            }
            R.id.itemmostrar->{
                when(vistaActual){
                    binding.view1->{binding.tv1.visibility=View.VISIBLE}
                    binding.view2->{binding.tv2.visibility=View.VISIBLE}
                }
            }
        }
        return super.onContextItemSelected(item)
    }
}