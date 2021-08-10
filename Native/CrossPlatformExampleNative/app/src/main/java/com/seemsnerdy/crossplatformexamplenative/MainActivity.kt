package com.seemsnerdy.crossplatformexamplenative

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.submitButton).setOnClickListener {
            val first = findViewById<EditText>(R.id.editFirst)
            val second = findViewById<EditText>(R.id.editSecond)
            val result = findViewById<TextView>(R.id.resultText)

            val resultText = "${first.text} ${second.text}"
            result.text = resultText
        }
    }
}