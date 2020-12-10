package com.java.automation.lab.fall.kapinus.core22.domain;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.net.URL;
import java.io.Serializable;

@XmlRootElement(name = "Contact")
@XmlType(propOrder = { "phoneNumber", "instagramAcc"})
public class Contact implements Serializable{
    private String phoneNumber;
    private URL instagramAcc;

    public Contact(){
    }

    public Contact(String phoneNumber, URL instagramAcc){
        this.phoneNumber = phoneNumber;
        this.instagramAcc = instagramAcc;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public URL getInstagramAcc(){
        return instagramAcc;
    }

    public void setInstagramAcc (URL instagramAcc){
        this.instagramAcc = instagramAcc;
    }

    @Override
    public String toString() {
        return "Contact {\n\tphoneNumber:" + phoneNumber +
                "\n\tinstagramAcc:" + instagramAcc + "\n}";
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
        return  phoneNumber.equals(((Contact)that).phoneNumber) &&
                instagramAcc.equals(((Contact)that).instagramAcc);
    }

    @Override
    public int hashCode() {
        return (phoneNumber.hashCode() * 7) + instagramAcc.hashCode();
    }
}
