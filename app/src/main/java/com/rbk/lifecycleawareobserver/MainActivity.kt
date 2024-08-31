package com.rbk.lifecycleawareobserver

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(MainObserver())
        Log.d("MAIN","Activity onCreate()")

    }

    override fun onResume() {
        super.onResume()
        Log.d("MAIN","Activity onResume()")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MAIN","Activity onStart()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MAIN","Activity onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MAIN","Activity onStop()")
    }
}