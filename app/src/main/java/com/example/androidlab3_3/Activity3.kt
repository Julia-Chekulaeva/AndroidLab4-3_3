package com.example.androidlab3_3

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.androidlab3_3.databinding.ActivityThirdBinding

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityThirdBinding.inflate(layoutInflater)
        binding.bnToFirst.setOnClickListener { toActivity1() }
        binding.bnToSecond.setOnClickListener { toActivity2() }
        binding.navView.setOnItemSelectedListener { toAboutActivity(it) }
        setContentView(binding.root)
    }

    private fun toActivity1() {
        startActivity(
            Intent(this, MainActivity::class.java)
            .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
    }

    private fun toActivity2() {
        startActivity(
            Intent(this, Activity2::class.java)
            .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
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