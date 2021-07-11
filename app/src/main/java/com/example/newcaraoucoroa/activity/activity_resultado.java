package com.example.newcaraoucoroa.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.newcaraoucoroa.R;

public class activity_resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado2);

        ImageView img_voltar = findViewById(R.id.img_voltar);
        ImageView img_resultado = findViewById(R.id.img_resultado);

        // recebendo o random number pra definir a img da tela
        Bundle bundleResultado = getIntent().getExtras();
        int defineImagem = bundleResultado.getInt("chaveRandom");

        // Definindo qual imagem vai aparecer...
        if (defineImagem == 0) {
            img_resultado.setImageResource(R.drawable.moeda_cara);
            Toast.makeText(this, "O resultado foi cara!", Toast.LENGTH_SHORT).show();
        } else {
            img_resultado.setImageResource(R.drawable.moeda_coroa);
            Toast.makeText(this, "O resultado foi coroa!", Toast.LENGTH_SHORT).show();
        }


        //Voltar a tela inicial
        Intent voltarHomeScreen = new Intent(getApplicationContext(), MainActivity.class);

        img_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                //@TODO IMPLEMENTAR CONTADOR NA TELA INICIAL
            }
        });

    }
}