package com.example.prework
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.orabutton)
        button.setOnClickListener {
            Log.v("Hello world", "Button clicked!")
            Toast.makeText(this, "ORA ORA ORA", Toast.LENGTH_SHORT).show()
        }
    }
}