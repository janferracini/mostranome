package com.meusite.mostranome;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtNome;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.edtNome);
        btnEnviar = findViewById(R.id.tbnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View view) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                alerta.setMessage("Olá " + edtNome.getText().toString() + "! \nEsse é meu primeiro aplicativo!") ;
                alerta.setNeutralButton("Fechar", null);
                alerta.show();
            }
        });




    }
}