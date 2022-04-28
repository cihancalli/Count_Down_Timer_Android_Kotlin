package com.zerdasoftware.countdowntimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_start.setOnClickListener {
            val count = object :CountDownTimer(30000,1000){
                override fun onTick(p0: Long) {
                    textView_time.text = "Time Remaining: ${p0 /1000} sn"
                }

                override fun onFinish() {
                    textView_time.text = "Finish"
                }
            }
            count.start()
        }
    }
}