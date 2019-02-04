package com.example.vpopov.apptest

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_layout.*

class MainActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout)
    }

    fun toastMe(view: View){
        val myToast = Toast.makeText(this, "Hello Viktor",Toast.LENGTH_SHORT )
        myToast.show()
    }

    fun countMe(view: View){
        val countString = textView.text.toString()
        var count : Int = Integer.parseInt(countString)
        count++
        textView.text = count.toString()
    }

    fun randomMe(view: View){
        val randomIntent = Intent(this, SecondActivity::class.java)

        val countString = textView.text.toString()

        val count = Integer.parseInt(countString)

        randomIntent.putExtra(SecondActivity.TOTAL_COUNT,count)

        startActivity(randomIntent)

    }
}