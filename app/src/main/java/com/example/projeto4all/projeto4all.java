package com.example.projeto4all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class projeto4all extends AppCompatActivity {

    //função iniciar o app
    public void iniciarApp (View view){
        Intent intent1 = new Intent(getApplicationContext(), appImc.class);
        startActivity( intent1 );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }
}
