package com.example.studentapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Main2Activity : AppCompatActivity() {
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)

        btn1.setOnClickListener {
            val intentDestination = Intent(this@Main2Activity, S1Details::class.java)
            startActivity(intentDestination)
        }

        btn2.setOnClickListener {
            val intentDestination = Intent(this@Main2Activity, S2Details::class.java)
            startActivity(intentDestination)
        }

        btn3.setOnClickListener {
            val intentDestination = Intent(this@Main2Activity, S3Details::class.java)
            startActivity(intentDestination)
        }

        btn4.setOnClickListener {
            val intentDestination = Intent(this@Main2Activity, S4Details::class.java)
            startActivity(intentDestination)
        }

        btn5.setOnClickListener {
            val intentDestination = Intent(this@Main2Activity, MainActivity::class.java)
            startActivity(intentDestination)
        }

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}