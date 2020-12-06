package com.java.automation.lab.fall.kapinus.core22.domain;


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlRootElement(name = "CardioTraining")
@XmlType(propOrder = { "equipment", "duration"})
public class CardioTraining extends Training implements Serializable {
    private CardioEquipment equipment;
    private double duration;

    public CardioTraining(String name, Trainer trainer, Client client,
                          CardioEquipment equipment, double duration){
        super(name, trainer, client);
        this.equipment = equipment;
        this.duration = duration;

    }

    public CardioEquipment getEquipment() {
        return equipment;
    }

    public void setEquipment(CardioEquipment equipment) {
        this.equipment = equipment;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "CardioTraining {\n\tequipment:" + equipment +
                "\n\tduration:" + Double.toString(duration) + "\n}";
    }

    @Override
    public boolean equals(Object that) {
        if (that == null) {
            return false;
        }
        if (this.getClass() != that.getClass()) {
            return false;
        }
        if (this == that) {
            return true;
        }
        return  equipment.equals(((CardioTraining)that).equipment) &&
                duration == ((CardioTraining)that).duration;
    }

    @Override
    public int hashCode() {
        return (equipment.hashCode() * 17) + 5;
    }


}
