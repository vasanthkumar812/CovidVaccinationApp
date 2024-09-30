package com.v1.covidvaccinationapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button adminButton = findViewById(R.id.adminButton);
        Button userButton = findViewById(R.id.userButton);

        userButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, UserActivity.class)));

        adminButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, AdminActivity.class)));
    }
}
