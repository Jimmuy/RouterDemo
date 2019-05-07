package com.jimmy.routerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jimmy.lib.JRouter

@JRouter(path = "main/main")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
