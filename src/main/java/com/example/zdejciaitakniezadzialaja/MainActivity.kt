package com.example.zdejciaitakniezadzialaja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
/**
An example to set OnClickListener for ImageView in Kotlin Android
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// get reference to ImageView
        val iv_click_me = findViewById(R.id.iv_click_me) as ImageView
// set on - click listener
        iv_click_me.setOnClickListener {
            Toast.makeText(this@MainActivity, "I tak nie zadziała", Toast.LENGTH_SHORT).show()
        }
    }
}
