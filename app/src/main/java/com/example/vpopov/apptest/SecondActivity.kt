package com.example.vpopov.apptest

import android.app.Activity

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import kotlin.random.Random

class SecondActivity: Activity() {
    companion object {
        const  val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }


    fun showRandomNumber(){

        val count = intent.getIntExtra(TOTAL_COUNT,0)

        val random = Random
        var randomInt = 0

        if(count > 0){
              randomInt = random.nextInt(count + 1)

        }

        textViewRandom.text = Integer.toString(randomInt)
        textViewLabel.text = getString(R.string.random_heading,count)
    }
}