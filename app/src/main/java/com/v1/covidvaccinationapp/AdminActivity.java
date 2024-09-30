package com.v1.covidvaccinationapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        Button postSlotButton = findViewById(R.id.postSlotButton);
        Button viewStatusButton = findViewById(R.id.viewStatusButton);

        // Use lambda expressions for click listeners
        postSlotButton.setOnClickListener(v -> {
            // Add a slot to the database
            Slot newSlot = new Slot("12-10-2024", "10:00 AM", "City Hospital");
            SlotDatabase.addSlot(newSlot);
            Toast.makeText(AdminActivity.this, "Slot Posted!", Toast.LENGTH_SHORT).show();
        });

        viewStatusButton.setOnClickListener(v -> {
            // View user vaccination status
            ArrayList<String> statuses = UserStatusDatabase.getStatuses();
            for (String status : statuses) {
                //Toast.makeText(AdminActivity.this,  ,status, Toast.LENGTH_LONG).show();
                Toast.makeText(AdminActivity.this, "User not yet vaccinated !", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
