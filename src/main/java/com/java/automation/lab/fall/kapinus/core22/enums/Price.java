package com.java.automation.lab.fall.kapinus.core22.enums;


public enum Price{
    MONTH("8 trainings"),
    THREE_MONTH("24 trainings"),
    YEARS("96 trainings"),
    MONTH_MORNING("8 trainings, valid until 3 p.m."),
    ONE_TIME("one training for one client"),
    TRIAL("one training for a new client"),
    INDIVIDUAL("one training with a personal trainer");

    private String description;

    Price(String description){
        this.description = description;
    }

    public String description(){
        return description;
    }
}
