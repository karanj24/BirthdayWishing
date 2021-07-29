package com.headlit.birthdaywishingapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bday_wishing.*

class BdayWishingActivity : AppCompatActivity() {

    companion object{
        const val name_extra="name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bday_wishing)
        val name=intent.getStringExtra(name_extra)
        bdaygreeting.text="Happy Birthday\n$name!"
    }
}