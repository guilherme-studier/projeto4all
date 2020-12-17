package com.example.projeto4all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class appImc extends AppCompatActivity {

    public EditText editPeso;
    public EditText editAltura;
    public TextView textResultado;

    public void voltar (View view){
        Intent intent1 = new Intent(getApplicationContext(), projeto4all.class);
        startActivity( intent1 );

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_app_imc );

        editPeso = findViewById( R.id.editPeso );
        editAltura = findViewById( R.id.editAltura);
        textResultado = findViewById( R.id.textResultado);
    }

    public void calcularImc(View view){
        double peso = Double.parseDouble( editPeso.getText().toString() );
        double altura = Double.parseDouble( editAltura.getText().toString() );
        double imc = peso/(altura*altura);

        //lógica do resultado através de operador de condição
        if(imc >= 18.5 && imc <= 24.99){
            //declaração do resultado
            textResultado.setText( "Peso normal, IMC = " + imc );

        }else if (imc >= 25 && imc <= 29.99){
            //declaração do resultado
            textResultado.setText( "Acima do peso, IMC = " + imc );
        }else if (imc >= 30 && imc <= 34.99) {
            //declaração do resultado
            textResultado.setText( "Obesidade I, IMC = " + imc );
        }else if (imc >= 35 && imc <= 39.99) {
            //declaração do resultado
            textResultado.setText( "Obesidade II, IMC = " + imc );
        }else if (imc > 40) {
            //declaração do resultado
            textResultado.setText( "Obesidade III, IMC = " + imc );
        }
    /*Fórmula do IMC:
        peso/altura²
     */

    }
}