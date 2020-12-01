package com.java.automation.lab.fall.kapinus.core22.enums;

public enum TrainerSpecialization {
    GYM ("Cardio and power equipment"),
    BOXING("punching bag and gloves"),
    FITNESS("sports mat, dumbbells, medicine balls"),
    STRETCHING("sports mat"),
    ZUMBA("nothing"),
    YOGA("sports mat");

    private String equipment;

    TrainerSpecialization(String equipment){
        this.equipment = equipment;
    }

    public String equipment(){
        return equipment;
    }
}
