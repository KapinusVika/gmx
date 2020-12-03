package com.java.automation.lab.fall.kapinus.core22.domain;

import com.java.automation.lab.fall.kapinus.core22.dao.abstractModel.AbstractModel;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;
import java.io.Serializable;

@XmlRootElement(name = "DescriptionEquipment")
@XmlType(propOrder = { "name", "weight", "madeIn", "year"})
public class DescriptionEquipment extends AbstractModel implements Serializable, Comparable<DescriptionEquipment>{
    private String name;
    private int weight;
    private String madeIn;
    private int year;

    public DescriptionEquipment(String name, int weight, String madeIn, int year){
        this.name = name;
        this.weight = weight;
        this.madeIn = madeIn;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "DescriptionEquipments{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", madeIn='" + madeIn + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DescriptionEquipment that = (DescriptionEquipment) o;
        return weight == that.weight &&
                year == that.year &&
                Objects.equals(name, that.name) &&
                Objects.equals(madeIn, that.madeIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, madeIn, year);
    }

    @Override
    public int compareTo(DescriptionEquipment o) {
        return this.getYear() - o.getYear();
    }
}
