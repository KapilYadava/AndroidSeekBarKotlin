package com.example.androidseekbarkotlin

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var red: Int = 0
    private var green: Int = 0
    private var blue: Int = 0
    private val alpha: Int = 255

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sbRed.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {

            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                textRed.text = p1.toString()
                red = p1
                background.setBackgroundColor(Color.argb(alpha, red, green, blue))
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })

        sbGreen.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {

            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                txtGreen.text = p1.toString()
                green = p1
                background.setBackgroundColor(Color.argb(alpha, red, green, blue))
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })

        sbBlue.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {

            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                txtBlue.text = p1.toString()
                blue = p1
                background.setBackgroundColor(Color.argb(alpha, red, green, blue))
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })
    }
}
