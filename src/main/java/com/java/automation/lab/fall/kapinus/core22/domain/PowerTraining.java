package com.java.automation.lab.fall.kapinus.core22.domain;


public class PowerTraining extends Training{
    private PowerEquipment equipment;
    private double workingWeight;


    public PowerTraining(PowerEquipment equipment, String name, Trainer trainer, Client client,
                         double workingWeight) {
        super(name, trainer, client);
        this.equipment = equipment;
        this.workingWeight = workingWeight;

    }

    public double getWorkingWeight() {
        return workingWeight;
    }

    public void setMaxWorkingWeight(double name) {
        this.workingWeight = name;
    }

    @Override
    public String toString() {
        return "PowerTraining {\n\tequipment:" + equipment +
                "\n\tworkingWeight:" + Double.toString(workingWeight) +
                "\n}";
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
        return  equipment.equals(((PowerTraining)that).equipment) &&
                workingWeight == ((PowerTraining)that).workingWeight;
    }

    @Override
    public int hashCode() {
        String wW = Double.toString(workingWeight);
        return (wW.hashCode() * 5) + 97;
    }

}
