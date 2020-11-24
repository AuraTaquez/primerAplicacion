package com.example.primeraplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class actividadSaludo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_saludo);
        TextView lblDescripciones = (TextView) findViewById(R.id.lblDescripcion);
        Bundle bundle = this.getIntent().getExtras();
        lblDescripciones.setText("DATOS PERSONALES \n "+ "Nombres " +bundle.getString("Nombre"));
    }
}