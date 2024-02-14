package com.example.learnprogramming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.applicationforhh.BNWActivity
import com.example.applicationforhh.R

class MainActivity : AppCompatActivity() {

    lateinit var openButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openButton = findViewById(R.id.enterregbtn)

        openButton.setOnClickListener {
            val intent = Intent(this, BNWActivity::class.java)
            startActivity(intent)
        }
    }
}