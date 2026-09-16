package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.widget.Button
import android.graphics.Color

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val textView = findViewById<TextView>(R.id.textView)
        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            textView.text = "Hello, Martas"
        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            textView.setTextColor(Color.RED)
        }
        val button3 = findViewById<Button>(R.id.button3)
        val rootLayout = findViewById<View>(R.id.main) // id of the root layout
        button3.setOnClickListener {
            rootLayout.setBackgroundColor(Color.YELLOW)
    }
}