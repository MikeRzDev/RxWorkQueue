package com.mikerzdev.rxworkqueue

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_activity1.setOnClickListener {
            startActivity(Intent(this, Activity1::class.java))
        }
        btn_activity2.setOnClickListener {
            startActivity(Intent(this, Activity2::class.java))
        }
    }
}
