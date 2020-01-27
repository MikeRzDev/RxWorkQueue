package com.mikerzdev.rxworkqueue

import android.app.Application

class App: Application() {

    //App Scoped
    val rxWorkQueue = SerialWorkQueue()

    override fun onCreate() {
        super.onCreate()
    }
}