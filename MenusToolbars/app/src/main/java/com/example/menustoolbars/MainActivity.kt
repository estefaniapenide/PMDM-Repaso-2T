package com.example.menustoolbars

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.menustoolbars.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.title="MENUS Y TOOLBARS"

        binding.button1.setOnClickListener { startActivity( Intent(this, Ej01OptionsMenuActivity::class.java )) }
        binding.button2.setOnClickListener { startActivity(Intent(this,Ej02OptionsMenusItemsActivity::class.java)) }
        binding.button3.setOnClickListener { startActivity(Intent(this,Ej03AtrasActivity::class.java)) }
        binding.button4.setOnClickListener { startActivity(Intent(this,Ej04ContextMenuActivity::class.java)) }
        binding.button42.setOnClickListener { startActivity(Intent(this, Ej042ContextMenuActivity::class.java)) }
        binding.button5.setOnClickListener { startActivity(Intent(this,Ej05ToolBarActivity::class.java)) }
        binding.button6.setOnClickListener { startActivity(Intent(this,Ej06AtrasMenuToolBarActivity::class.java)) }
        binding.button7.setOnClickListener { startActivity(Intent(this,Ej07NavigationDrawerActivity::class.java)) }
    }
}