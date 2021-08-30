    package com.example.media_player

import android.app.Service
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings
import android.widget.Toast

class M:Service(){
    var mp:MediaPlayer= MediaPlayer()
    override fun onBind(intent: Intent?): IBinder?=null


    override fun onCreate() {
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        mp=MediaPlayer.create(this,R.raw.dusk_till_dawn)
        mp.start()
        mp.setLooping(true)
        return START_STICKY
    }

    override fun onDestroy() {
        mp.stop()
        super.onDestroy()

    }

}
    