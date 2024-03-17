package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText campoNome;
    Button btnsaudacao;
    TextView TVmensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);
        btnsaudacao = findViewById(R.id.btnBotao);
        TVmensagem = findViewById(R.id.tvNome);

        btnsaudacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = campoNome.getText().toString();
                String mensagem = "Olá, "+nome;
                TVmensagem.setText(mensagem);
            }
        });
    }
}