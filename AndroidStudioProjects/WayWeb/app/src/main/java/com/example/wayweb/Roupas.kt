package com.example.wayweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_roupas.*

class Roupas : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roupas)

        comprar.setOnClickListener {
            Toast.makeText(this, "Compra realizada com sucesso!", Toast.LENGTH_LONG).show()
        }
    }
}