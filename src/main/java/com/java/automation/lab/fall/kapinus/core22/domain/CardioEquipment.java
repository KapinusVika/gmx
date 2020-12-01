package com.java.automation.lab.fall.kapinus.core22.domain;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;
import java.io.Serializable;

@XmlRootElement(name = "CardioEquipment")
@XmlType(propOrder = { "maxWeight"})
public class CardioEquipment extends Equipment implements Serializable{
    private double maxWeight;

    public CardioEquipment(DescriptionEquipment descriptionEquipment, double maxWeight){
        super(descriptionEquipment);
        this.maxWeight = maxWeight;
    }


    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }


    @Override
    public String toString() {
        return "CardioEquipment{" +
                "maxWeight=" + maxWeight +
                '}';
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
        return maxWeight == ((CardioEquipment)that).maxWeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxWeight);
    }
}
