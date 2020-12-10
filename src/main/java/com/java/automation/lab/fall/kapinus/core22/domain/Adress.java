package com.java.automation.lab.fall.kapinus.core22.domain;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlRootElement(name = "Adress")
@XmlType(propOrder = { "city", "street", "build", "apt" })
public class Adress implements Serializable {
    private String city;
    private String street;
    private int build;
    private int apartment;

    public Adress(){
    }

    public Adress(String city, String street, int build, int apartment){
        this.city = city;
        this.street = street;
        this.build = build;
        this.apartment = apartment;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getStreet(){
        return street;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public int getBuild(){
        return build;
    }

    public void setBuild(int build){
        this.build = build;
    }

    public int getApartment(){
        return apartment;
    }

    public void setApartment(int apt){
        this.apartment = apt;
    }

    @Override
    public String toString() {
        return "Adress {\n\tcity:" + city +
                "\n\tstreet:" + street +
                "\n\tbuild:" + Integer.toString(build) +
                "\n\tapt:" + Integer.toString(apartment) +
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
        return  city.equals(((Adress)that).city) &&
                street.equals(((Adress)that).street) &&
                build == ((Adress)that).build &&
                apartment == ((Adress)that).apartment;
    }

    @Override
    public int hashCode() {
        return (apartment + street.hashCode() ) * build;
    }

}



