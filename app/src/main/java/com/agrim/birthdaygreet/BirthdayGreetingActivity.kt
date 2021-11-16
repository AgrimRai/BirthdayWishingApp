package com.agrim.birthdaygreet

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.birthday_greeting_activity)
        val name= intent.getStringExtra(NAME_EXTRA)

        val birthdayGreeting =findViewById<TextView>(R.id.birthdayGreeting)
        birthdayGreeting.text= "Happy Birthday $name"

    }
}