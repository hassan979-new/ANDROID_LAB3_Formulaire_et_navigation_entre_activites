package com.example.lab3;

import android.content.Intent;
import android.os.Bundle;
import android.os.PatternMatcher;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private EditText nom, email, phone, adresse, ville;

    private Button btnEnvoyer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nom = findViewById(R.id.nom);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.telephone);
        adresse = findViewById(R.id.adresse);
        ville = findViewById(R.id.ville);
        btnEnvoyer = findViewById(R.id.btnEnvoyer);

        btnEnvoyer.setOnClickListener(
                v -> {
                    String sNom = nom.getText().toString().trim();
                    String sEmail = email.getText().toString().trim();
                    String sPhone   = phone.getText().toString().trim();
                    String sAdresse = adresse.getText().toString().trim();
                    String sVille   = ville.getText().toString().trim();

                    if (sNom.isEmpty() || sEmail.isEmpty()){
                        Toast.makeText(this, "Nom et Email sont obligatoire",Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (!Patterns.EMAIL_ADDRESS.matcher(sEmail).matches()){
                        Toast.makeText(this,"Email invalid!", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    Intent intent = new Intent(MainActivity.this, Screen2Activity.class);

                    intent.putExtra("nom", sNom);
                    intent.putExtra("email", sEmail);
                    intent.putExtra("phone", sPhone);
                    intent.putExtra("adresse", sAdresse);
                    intent.putExtra("ville", sVille);

                    startActivity(intent);
                }
        );


    }

    @Override
    protected void onResume() {
        super.onResume();
        nom.setText("");
        email.setText("");
        phone.setText("");
        adresse.setText("");
        ville.setText("");
    }
}