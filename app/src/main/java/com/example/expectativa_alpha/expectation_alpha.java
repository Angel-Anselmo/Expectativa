package com.example.expectativa_alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class expectation_alpha extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTramites = findViewById(R.id.btn_tramites);
        Button btnServices = findViewById(R.id.btn_servicios);
        Button btnReports = findViewById(R.id.btn_reportes);

        btnTramites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tramitesIntent = new Intent(expectation_alpha.this, TramitesActivity.class);
                startActivity(tramitesIntent);
            }
        });

        btnServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serviciosIntent = new Intent(expectation_alpha.this, ServicesActivity.class);
                startActivity(serviciosIntent);
            }
        });

        btnReports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reportesIntent = new Intent(expectation_alpha.this, ReportsActivity.class);
                startActivity(reportesIntent);
            }
        });
    }
}