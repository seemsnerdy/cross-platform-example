package com.seemsnerdy.crossplatformexample.android

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.seemsnerdy.crossplatformexample.Evaluator

fun evaluate(a: String, b: String): String {
    return Evaluator(a, b).evaluate()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.submitButton).setOnClickListener {
            val a = findViewById<EditText>(R.id.firstInput).text.toString()
            val b = findViewById<EditText>(R.id.secondInput).text.toString()

            val result = evaluate(a, b)

            findViewById<TextView>(R.id.resultText).text = result
        }
    }
}
