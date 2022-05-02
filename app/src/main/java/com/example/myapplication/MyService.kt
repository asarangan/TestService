package com.example.myapplication

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import android.widget.Toast




class MyService: Service() {
    override fun onBind(p0: Intent?): IBinder? {
        return null
    }


    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Let it continue running until it is stopped.
        Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show()
        Log.d("TEST","test")
        return START_STICKY
    }


    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show()
    }

}