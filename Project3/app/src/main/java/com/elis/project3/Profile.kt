package com.elis.project3

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_profile.*

class Profile : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        button4.setOnClickListener{
            button4.text = "Following"
            lbl_text.text = "915"
        }

        btn_back.setOnClickListener {
            val back = Intent(this@Profile, MainActivity::class.java)
            startActivity(back)
        }
    }
}