package com.java.automation.lab.fall.kapinus.core22.domain;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.List;

@XmlRootElement(name = "Exercise")
@XmlType(propOrder = { "exercise"})
public class Exercise implements Serializable {
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