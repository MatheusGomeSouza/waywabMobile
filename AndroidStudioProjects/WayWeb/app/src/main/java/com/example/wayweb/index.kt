package com.example.wayweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_index.*

class index : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)
        val args = intent.extras

        val nome_usuario = args?.getString("nome_usuario")
        txt_usuario.text = nome_usuario
    }
}