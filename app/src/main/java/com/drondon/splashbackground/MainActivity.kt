package com.drondon.splashbackground

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //App Loading imitation
        Thread.sleep(5000)
    }

    override fun onResume() {
        super.onResume()
        //Remove app background
        window.decorView.background = null
    }
}
