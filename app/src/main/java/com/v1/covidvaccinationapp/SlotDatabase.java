package com.v1.covidvaccinationapp;

import java.util.ArrayList;

public class SlotDatabase {
    private static final ArrayList<Slot> slots = new ArrayList<>();

    public static void addSlot(Slot slot) {
        slots.add(slot);
    }

    public static ArrayList<Slot> getSlots() {
        return slots;
    }

    public static Slot bookSlot() {
        if (!slots.isEmpty()) {
            return slots.remove(0);  // Book the first available slot
        }
        return null;
    }
}

