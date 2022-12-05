package com.example.androidlab3_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.androidlab3_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        binding.bnToSecond.setOnClickListener { toActivity2() }
        binding.navView.setOnItemSelectedListener { toAboutActivity(it) }
        setContentView(binding.root)
    }

    private fun toActivity2() {
        startActivity(Intent(this, Activity2::class.java))
    }

    private fun toAboutActivity(menuItem: MenuItem) : Boolean {
        when (menuItem.itemId) {
            R.id.ic_info -> {
                startActivity(Intent(this, ActivityAbout::class.java))
            }
        }
        return false
    }
}
