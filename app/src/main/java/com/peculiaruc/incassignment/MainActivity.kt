package com.peculiaruc.incassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun LetsCount(view: View) {
        //increment
        count ++

        val textCount = findViewById<TextView>(R.id.textCount)
        textCount.text = " $count "
    }

}