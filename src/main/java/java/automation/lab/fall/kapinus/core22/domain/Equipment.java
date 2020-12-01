package java.automation.lab.fall.kapinus.core22.domain;

import java.util.Objects;

public abstract class Equipment {
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


