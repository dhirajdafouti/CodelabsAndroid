package com.project.bottomnavigation

import android.os.Bundle
import android.os.PersistableBundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AppBarLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_app_bar_layout)
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(false)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.home -> {
                Toast.makeText(this, "This is Home Clicked", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.cart -> {
                Toast.makeText(this, "This is Cart Clicked", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.setting -> {
                Toast.makeText(this, "This is Setting Clicked", Toast.LENGTH_LONG).show()
                return true
            }
            else -> {
                super.onOptionsItemSelected(item)
                return true
            }
        }

    }

}