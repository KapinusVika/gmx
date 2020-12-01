package com.java.automation.lab.fall.kapinus.core22.domain;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.Objects;

@XmlRootElement(name = "Equipment")
@XmlType(propOrder = { "descriptionEquipment"})
public abstract class Equipment implements Serializable {
    private DescriptionEquipment descriptionEquipment;

    public Equipment(DescriptionEquipment descriptionEquipment){
        this.descriptionEquipment = descriptionEquipment;
    }

    public DescriptionEquipment getDescriptionEquipment() {
        return descriptionEquipment;
    }

    public Equipment setDescriptionEquipment(DescriptionEquipment descriptionEquipment) {
        this.descriptionEquipment = descriptionEquipment;
        return this;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "descriptionEquipment=" + descriptionEquipment +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return Objects.equals(descriptionEquipment, equipment.descriptionEquipment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descriptionEquipment);
    }
}


