package com.example.myapplicationbrass;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import org.jetbrains.annotations.Nullable;

public final class AccueilActivity extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_accueil);
        Button btnConnexion = (Button)findViewById(R.id.buttonConnexion);
        btnConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AccueilActivity.this, ConnecterActivity.class));
            }
        });
    }
}
