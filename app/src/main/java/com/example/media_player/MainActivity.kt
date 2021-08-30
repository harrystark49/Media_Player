package com.example.media_player

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent=Intent(this,M::class.java)
     buttonstart.setOnClickListener {
         startService(intent)
     }
        btnstopservice.setOnClickListener {
            stopService(intent)
        }

    }
}
