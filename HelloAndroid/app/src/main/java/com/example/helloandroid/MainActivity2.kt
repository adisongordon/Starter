package com.example.helloandroid

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        // Gets the data from intent
        val buttonText = intent.getStringExtra("BUTTON_TEXT")

        // Gets TextView and sets up the text
        val displayText = findViewById<TextView>(R.id.displayText)
        displayText.text = buttonText

        // Sets up the back button
        val backButton = findViewById<Button>(R.id.backButton)
        backButton.setOnClickListener {
            finish() // Goes back to the first activity/main screen
        }
    }
}