package com.example.apple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttondark = findViewById<Button>(R.id.darkbutton)
        val buttonread = findViewById<Button>(R.id.readbutton)
        val layout = findViewById<LinearLayout>(R.id.linearlayout)
        val buttonjayesh = findViewById<Button>(R.id.button1)
        val buttonaryan = findViewById<Button>(R.id.button2)
        val buttonbenz = findViewById<Button>(R.id.button3)


        buttonread.setOnClickListener {
            //change to light mode
            layout.setBackgroundResource(R.color.yellow)

        }

        buttondark.setOnClickListener {
            layout.setBackgroundResource(R.color.black)
        }
        buttonjayesh.setOnClickListener {
            layout.setBackgroundResource(R.color.teal_700)
            Toast.makeText(applicationContext, "JAYESH REDDY", Toast.LENGTH_SHORT).show()
        }
        buttonaryan.setOnClickListener {
            layout.setBackgroundResource(R.color.teal_200)
            Toast.makeText(applicationContext, "THIS APP IS DESIGNED BY ARYAN", Toast.LENGTH_SHORT).show()
        }
        buttonbenz.setOnClickListener {
            layout.setBackgroundResource(R.color.green)
        }
    }
}