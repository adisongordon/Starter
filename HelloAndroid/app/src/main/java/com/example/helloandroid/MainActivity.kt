package com.example.helloandroid

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Sets up the buttons
       val buttonIDs = listOf(
           R.id.button1,
           R.id.button2,
           R.id.button3,
           R.id.button4,
           R.id.button5
       )
        // Sets the same click listeners for all of the buttons
        for (id in buttonIDs) {
            findViewById<Button>(id).setOnClickListener { button ->
                val buttonText = (button as Button).text.toString()
                navigateToSecondActivity(buttonText)
            }
        }
    }
    // Navigates to the second activity
    private fun navigateToSecondActivity(buttonText: String) {
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("BUTTON_TEXT", buttonText)
        startActivity(intent)
    }
}