package com.example.newcaraoucoroa.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.newcaraoucoroa.R;

import java.lang.annotation.Target;
import java.security.PublicKey;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView botao_jogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();

        Intent telaResultado = new Intent(getApplicationContext(), activity_resultado.class);
        telaResultado.putExtra("chaveRandom", random.nextInt(2));

        botao_jogar = findViewById(R.id.img_jogar);
        botao_jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(telaResultado);
            }
        });
    }
}