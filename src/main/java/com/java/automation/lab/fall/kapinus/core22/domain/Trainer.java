package com.java.automation.lab.fall.kapinus.core22.domain;

import com.java.automation.lab.fall.kapinus.core22.enums.TrainerSpecialization;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.java.automation.lab.fall.kapinus.core22.exceptions.AgeTrainerException;
import com.java.automation.lab.fall.kapinus.core22.exceptions.InvalidScheduleException;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;

@XmlRootElement(name = "Trainer")
@XmlType(propOrder = { "name", "age", "trainerSpecialization", "schedule"})
public class Trainer implements Serializable{
    private String name;
    private int age;
    private TrainerSpecialization trainerSpecialization;
    private int [][] schedule ;

    public Trainer(){
    }

    public Trainer(String name, int age, TrainerSpecialization trainerSpecialization, int[][] schedule) {
        this.name = name;
        this.age = age;
        this.trainerSpecialization = trainerSpecialization;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public TrainerSpecialization getTrainerSpecialization() {
        return trainerSpecialization;
    }

    public void setTrainerSpecialization(TrainerSpecialization trainerSpecialization) {
        this.trainerSpecialization = trainerSpecialization;
    }

    public int [][] getSchedule(){
        return schedule;
    }

    public void setSchedule(int [][] schedule){
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", trainerSpecialization=" + trainerSpecialization +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainer trainer = (Trainer) o;
        return age == trainer.age &&
                Objects.equals(name, trainer.name) &&
                trainerSpecialization == trainer.trainerSpecialization &&
                Arrays.equals(schedule, trainer.schedule);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, age, trainerSpecialization);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }
}