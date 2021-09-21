package com.example.wayweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.login.*
import android.content.Intent
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        botao_login.setOnClickListener {
            Toast.makeText(this, "clicou no botão de login", Toast.LENGTH_LONG).show()

            val nome_usuario = campo_nome.text.toString()

            var intent = Intent(this, index::class.java)

            intent.putExtra("nome_usuario", nome_usuario)
            startActivity(intent)
        }
    }
}