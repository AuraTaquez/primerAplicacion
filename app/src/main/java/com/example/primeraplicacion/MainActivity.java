package com.example.primeraplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void btnEnviar (View view)
{
    Intent intent = new Intent( MainActivity.this, actividadSaludo.class);
    EditText txtNombre= (EditText)findViewById(R.id.txtNombres);
    EditText txtTelefonos =(EditText) findViewById(R.id.txtTelefono);
    EditText txtFecha =(EditText) findViewById(R.id.txtFecha);
    RadioButton rbmasculino = (RadioButton) findViewById(R.id.rbtMaculino);
    RadioButton rbfemenino = (RadioButton) findViewById(R.id.rbtFemenina);
    Bundle b= new Bundle();
if(rbmasculino.isChecked()==true)
{
    b.putString("Nombre", txtNombre.getText().toString() + "\n "
            + "Genero " + "Masculino \n "
            + "Teléfono: " +txtTelefonos.getText().toString() + "\n "
            + "Fecha de nacimiento: " +txtFecha.getText().toString());
}
    if(rbfemenino.isChecked()==true)
    {
        b.putString("Nombre", txtNombre.getText().toString() + "\n "
                + "Genero: " + "Femenina \n "
                + "Teléfono: " +txtTelefonos.getText().toString() + "\n "
                + "Fecha de nacimiento: " +txtFecha.getText().toString());
    }

    intent.putExtras(b);
    startActivity(intent);
}

}