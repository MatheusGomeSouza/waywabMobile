package com.example.wayweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_index.*
import android.content.Intent
import android.widget.Toast

class index : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)
        val args = intent.extras

        var intent = Intent(this, Roupas::class.java)

        roupa1.setOnClickListener{

        }
    }
}