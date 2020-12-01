package com.java.automation.lab.fall.kapinus.core22.domain;
import java.util.List;

public class Exercise {
    private List<Training> exercises;

    public Exercise(List<Training> exercises) {
        this.exercises = exercises;
    }

    public List<Training> getExercises() {
        return exercises;
    }

    public void setExercises(List<Training> exercises) {
        this.exercises = exercises;
    }
}