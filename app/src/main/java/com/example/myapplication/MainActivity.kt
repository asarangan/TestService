package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var msg = "Testing : "
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(msg, "The onCreate() event")
    }

    fun startService(view: View?) {
        startService(Intent(this, MyService::class.java))
    }

    fun stopService(view: View?) {
        stopService(Intent(this, MyService::class.java))
    }

}