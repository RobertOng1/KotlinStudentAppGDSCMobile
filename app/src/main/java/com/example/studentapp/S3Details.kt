package com.example.studentapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class S3Details : AppCompatActivity() {
    private lateinit var btn1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_s3_details)
        btn1 = findViewById(R.id.btn1)

        btn1.setOnClickListener {
            val intentDestination = Intent(this@S3Details, Main2Activity::class.java)
            startActivity(intentDestination)
        }
    }
}