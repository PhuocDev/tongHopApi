package com.example.externalapi_demo.entities;

import lombok.Data;

@Data
public class Activity {
    private String activity;
    private String type;
//    private int participants;
//    private float price;
//    private String link;
//    private String key;
//    private float accessibility;

    @Override
    public String toString() {
        return "Activity{" +
                "activity='" + activity + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
