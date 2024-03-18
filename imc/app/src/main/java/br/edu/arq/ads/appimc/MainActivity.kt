package br.edu.arq.ads.appimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var edtPeso: EditText
    lateinit var edtAltura: EditText
    lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtPeso = findViewById(R.id.edt_peso)
        edtAltura = findViewById(R.id.edt_altura)
        btnSend = findViewById(R.id.btn_send)

        btnSend.setOnClickListener {
            val pesoString = edtPeso.text.toString()
            val alturaString = edtAltura.text.toString()

            if (pesoString.isNotEmpty() && alturaString.isNotEmpty()) {
                val peso = pesoString.toFloat()
                val altura = alturaString.toFloat()

                val imc = peso / (altura * altura)

                val mensagem = if (imc < 18.5) {
                    "Abaixo do peso"
                } else if (imc >= 18.5 && imc < 25) {
                    "Peso normal"
                } else if (imc >= 25 && imc < 30) {
                    "Sobrepeso"
                } else {
                    "Obesidade"
                }

                val resultado = "Seu IMC é: %.2f - $mensagem".format(imc)

                Toast.makeText(this, resultado, Toast.LENGTH_LONG).show()
            }
        }
    }
}

