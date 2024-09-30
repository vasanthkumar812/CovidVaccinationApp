package com.v1.covidvaccinationapp;

public class Slot {
    private final String date;       // Made final
    private final String time;       // Made final
    private final String location;    // Made final

    public Slot(String date, String time, String location) {
        this.date = date;
        this.time = time;
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }
}