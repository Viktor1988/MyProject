package com.example.vpopov.apptest

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_layout.*

class MainActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val textView = TextView(this)
//        textView.setText("Привет, мое первое приложение")
        setContentView(R.layout.activity_layout)
        textView.setText("Hello Word")


    }

}