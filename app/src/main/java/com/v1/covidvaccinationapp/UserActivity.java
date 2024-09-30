package com.v1.covidvaccinationapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        // Convert fields to local variables
        Button viewSlotsButton = findViewById(R.id.viewSlotsButton);
        Button bookSlotButton = findViewById(R.id.bookSlotButton);
        Button viewStatusButton = findViewById(R.id.viewStatusButton);

        // Use lambda expressions for click listeners
        viewSlotsButton.setOnClickListener(v -> {
            // View available slots
            ArrayList<Slot> slots = SlotDatabase.getSlots();
            for (Slot slot : slots) {
                Toast.makeText(UserActivity.this, "Slot: " + slot.getDate() + " at " + slot.getLocation(), Toast.LENGTH_LONG).show();
            }
        });

        bookSlotButton.setOnClickListener(v -> {
            // Book the first available slot
            Slot bookedSlot = SlotDatabase.bookSlot();
            if (bookedSlot != null) {
                Toast.makeText(UserActivity.this, "Slot booked: " + bookedSlot.getDate(), Toast.LENGTH_SHORT).show();
                UserStatusDatabase.addStatus("Booked slot for " + bookedSlot.getDate());
            } else {
                Toast.makeText(UserActivity.this, "No available slots", Toast.LENGTH_SHORT).show();
            }
        });

        viewStatusButton.setOnClickListener(v -> {
            // View user vaccination status
            ArrayList<String> statuses = UserStatusDatabase.getStatuses();
            for (String status : statuses) {
                Toast.makeText(UserActivity.this, status, Toast.LENGTH_LONG).show();
                if(statuses != null){
                    Toast.makeText(UserActivity.this, "User Vaccinated !", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(UserActivity.this, "User need to be Vaccinated !", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}
