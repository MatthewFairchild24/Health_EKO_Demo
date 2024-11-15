package com.example.tryforeko

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_me)

        val buttonMe = findViewById<Button>(R.id.meButton)
        buttonMe.setOnClickListener {
            val intent = Intent(this, MeActivity::class.java)
            startActivity(intent)
        }

        val buttonDevice = findViewById<Button>(R.id.deviceButton)
        buttonDevice.setOnClickListener {
            val intent = Intent(this, DevicesActivity::class.java)
            startActivity(intent)
        }

        val buttonTracker = findViewById<Button>(R.id.trackerButton)
        buttonTracker.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}