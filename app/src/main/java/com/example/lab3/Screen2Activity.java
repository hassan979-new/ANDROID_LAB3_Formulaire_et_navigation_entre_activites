package com.example.lab3;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Screen2Activity extends AppCompatActivity {
    private TextView recap;
    private Button btnReturn;
    private Button btnPartage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        recap = findViewById(R.id.recap);
        btnReturn = findViewById(R.id.btnReteur);
        btnPartage = findViewById(R.id.btnPartage);


        Intent intent2 = getIntent();


        String nom     = intent2.getStringExtra("nom");
        String email   = intent2.getStringExtra("email");
        String phone   = intent2.getStringExtra("phone");
        String adresse = intent2.getStringExtra("adresse");
        String ville   = intent2.getStringExtra("ville");

        String message = "Nom: " + safe(nom) + "\n"
                + "Email: " + safe(email) + "\n"
                + "Telephone: " + safe(phone) + "\n"
                + "Adresse: " + safe(adresse) + "\n"
                + "Ville: " + safe(ville) + "\n";

        recap.setText(message);

        btnReturn.setOnClickListener(v -> finish());

        btnPartage.setOnClickListener(
                v -> {
                    Intent partage = new Intent(Intent.ACTION_SEND);
                    partage.setType("text/plain");
                    partage.putExtra(partage.EXTRA_TEXT, message);
                    startActivity(Intent.createChooser(partage, "partager avec"));
                }
        );

    }

    private String safe(String s){
        return (s == null || s.trim().isEmpty() ) ? "-" : s.trim();
    }
}
