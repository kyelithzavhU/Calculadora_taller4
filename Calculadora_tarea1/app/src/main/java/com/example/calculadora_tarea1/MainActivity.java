package com.example.calculadora_tarea1;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    EditText edittext1;
    EditText edittext2;
    TextView ressuma;
    TextView resmulti;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext1 = findViewById(R.id.NumberA);
        edittext2 = findViewById(R.id.NumberB);
        ressuma = findViewById(R.id.resuma);
        resmulti = findViewById(R.id.remultiplicacion);

    }

    public void calculo(View view){
        int operacionsuma = Integer.parseInt(edittext1.getText().toString()) + Integer.parseInt(edittext2.getText().toString());
        int operacionmulti = Integer.parseInt(edittext1.getText().toString()) * Integer.parseInt(edittext2.getText().toString());
        ressuma.setText(operacionsuma+"");
        resmulti.setText(operacionmulti+"");
    }

}
