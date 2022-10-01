package com.example.androidstudyjamsession1

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlin.random.Random as Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val root_layout=findViewById<View>(R.id.root_layout)

        val animDrawable = root_layout.background as AnimationDrawable
        animDrawable.setEnterFadeDuration(10)
        animDrawable.setExitFadeDuration(5000)
        animDrawable.start()


        val rollButton=findViewById<Button>(R.id.rollButton)
        val resultsTextView=findViewById<TextView>(R.id.resultsTextView)
        val seekBar=findViewById<SeekBar>(R.id.seekBar)


        rollButton.setOnClickListener {
            val rand = java.util.Random().nextInt(seekBar.progress)+1
            resultsTextView.text=rand.toString()
        }
    }
}