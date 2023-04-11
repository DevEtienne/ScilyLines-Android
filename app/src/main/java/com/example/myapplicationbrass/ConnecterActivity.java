package com.example.myapplicationbrass;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import org.jetbrains.annotations.Nullable;

public final class ConnecterActivity extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_connecter);
        Button btnDeconnexion = (Button)findViewById(R.id.buttonDeconnexion);
        Button btnProfil = (Button)findViewById(R.id.buttonProfil);
        Button btnReservations = (Button)findViewById(R.id.buttonReservations);
        btnDeconnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ConnecterActivity.this, AccueilActivity.class));
            }
        });
        btnProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ConnecterActivity.this, ModificationActivity.class));
            }
        });
        btnReservations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ConnecterActivity.this, ReservationsActivity.class));
            }
        });
    }

}
