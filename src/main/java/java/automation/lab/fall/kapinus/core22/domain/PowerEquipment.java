package java.automation.lab.fall.kapinus.core22.domain;


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;
import java.io.Serializable;


@XmlRootElement(name = "PowerEquipment")
@XmlType(propOrder = { "workingMuscle", "maxWorkingWeight"})
public class PowerEquipment extends Equipment implements Serializable {
    private String workingMuscle;
    private double maxWorkingWeight;


    public PowerEquipment(DescriptionEquipment descriptionEquipment, String workingMuscle, double maxWorkingWeight){
        super(descriptionEquipment);
        this.workingMuscle = workingMuscle;
        this.maxWorkingWeight = maxWorkingWeight;
    }

    public String getWorkingMuscle() {
        return workingMuscle;
    }

    public void setWorkingMuscle(String workingMuscle) {
        this.workingMuscle = workingMuscle;
    }

    public double getMaxWorkingWeight() {
        return maxWorkingWeight;
    }

    public void setMaxWorkingWeight(double maxWorkingWeight) {
        this.maxWorkingWeight = maxWorkingWeight;
    }


    @Override
    public String toString() {
        return "PowerEquipment{" +
                "workingMuscle='" + workingMuscle + '\'' +
                ", maxWorkingWeight=" + maxWorkingWeight +
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

        return  workingMuscle.equals(((PowerEquipment)that).workingMuscle) &&
                maxWorkingWeight == ((PowerEquipment)that).maxWorkingWeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), workingMuscle, maxWorkingWeight);
    }
}
