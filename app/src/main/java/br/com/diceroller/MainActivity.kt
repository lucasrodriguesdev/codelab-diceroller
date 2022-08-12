package br.com.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnJogar = findViewById<Button>(R.id.btnJogar)
        btnJogar.setOnClickListener {
            rolarDados()
        }
    }

    private fun rolarDados() {
        val dado = Dado(6)
        val resultadoDado = dado.rolarDados()
        val tvResultado = findViewById<TextView>(R.id.tv_resultado)
        tvResultado.text = resultadoDado.toString()
    }
}