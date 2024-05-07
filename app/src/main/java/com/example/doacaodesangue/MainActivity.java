package com.example.doacaodesangue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actionButton(View v) {
        //Entrada
        //vinculo
        EditText etN = (EditText)findViewById(R.id.idN);
        //tratamento
        String n = etN.getText().toString();
        //Calculo
        //instanciacao
        String tipo = (new TipoSanguineo()).doacao(n);
        //Saida
        TextView etResult = (TextView)findViewById(R.id.idResult);
        etResult.setText(tipo);

    }
}