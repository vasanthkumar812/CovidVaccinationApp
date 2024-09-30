package com.v1.covidvaccinationapp;

import java.util.ArrayList;

public class UserStatusDatabase {
    private static  final ArrayList<String> statuses = new ArrayList<>();

    public static void addStatus(String status) {
        statuses.add(status);
    }

    public static ArrayList<String> getStatuses() {
        return statuses;
    }
}
