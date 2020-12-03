package com.java.automation.lab.fall.kapinus.core22.domain;

import com.java.automation.lab.fall.kapinus.core22.dao.abstractModel.AbstractModel;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;
import java.io.Serializable;

@XmlRootElement(name = "TrainingProgram")
@XmlType(propOrder = { "nameTraining", "cardioTraining", "powerTraining"})
public class TrainingProgram extends AbstractModel implements Serializable{
    private String nameTraining;
    private CardioTraining cardioTraining;
    private PowerTraining powerTraining;


    public TrainingProgram(String nameTraining, CardioTraining cardioTraining, PowerTraining powerTraining){
        this.nameTraining = nameTraining;
        this.cardioTraining = cardioTraining;
        this.powerTraining = powerTraining;

    }

    public String getNameTraining() {
        return nameTraining;
    }

    public void setNameTraining(String nameTraining) {
        this.nameTraining = nameTraining;
    }

    public CardioTraining getCardioTraining() {
        return cardioTraining;
    }

    public void setCardioTraining(CardioTraining cardioTraining) {
        this.cardioTraining = cardioTraining;
    }

    public PowerTraining getPowerTraining() {
        return powerTraining;
    }

    public void setPowerTraining(PowerTraining powerTraining) {
        this.powerTraining = powerTraining;
    }

    @Override
    public String toString() {
        return "TrainingProgram{" +
                "nameTraining='" + nameTraining + '\'' +
                ", cardioTraining=" + cardioTraining +
                ", powerTraining=" + powerTraining +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainingProgram that = (TrainingProgram) o;
        return Objects.equals(nameTraining, that.nameTraining) &&
                Objects.equals(cardioTraining, that.cardioTraining) &&
                Objects.equals(powerTraining, that.powerTraining);
    }

    @Override
    public int hashCode() {
        return (nameTraining.hashCode() * 5) + 101;
    }
}