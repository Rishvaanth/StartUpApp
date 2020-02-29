package com.rishvaanth.startupapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val welcomeText = R.string.welcome_text_2.toString()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        welcome_text.text = "SuckoMaMudBalls"
    }
}
