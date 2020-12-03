package com.java.automation.lab.fall.kapinus.core22.domain;

import com.java.automation.lab.fall.kapinus.core22.dao.abstractModel.AbstractModel;
import com.java.automation.lab.fall.kapinus.core22.enums.Discount;
import com.java.automation.lab.fall.kapinus.core22.enums.Price;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.java.automation.lab.fall.kapinus.core22.exceptions.InvalidDiscountException;
import java.io.Serializable;

@XmlRootElement(name = "PricePlan")
@XmlType(propOrder = { "name", "nameDiscount", "discount", "validity"})
public class PricePlan extends AbstractModel implements Serializable{
    private Price name;
    private Discount nameDiscount;
    private int discount;
    private DateRange validity;


    public PricePlan(Price name, Discount nameDiscount, int discount, DateRange validity) throws InvalidDiscountException {
        if (discount > 100){
            throw new InvalidDiscountException();
        }
        this.name = name;
        this.nameDiscount = nameDiscount;
        this.discount = discount;
        this.validity = validity;
    }

    public Price getName() {
        return name;
    }

    public void setName(Price name) {
        this.name = name;
    }

    public Discount getNameDiscount() {
        return nameDiscount;
    }

    public void setNameDiscount(Discount nameDiscount) {
        this.nameDiscount = nameDiscount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public DateRange getValidity() {
        return validity;
    }

    public void setValidity(DateRange validity) {
        this.validity = validity;
    }

    @Override
    public String toString() {
        return "PricePlan {\n\tname:" + name +
                "\n\tnameDiscount:" + nameDiscount +
                "\n\tdiscount:" + Integer.toString(discount) +
                "\n\tvalidity:" + validity +
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
        return  name.equals(((PricePlan)that).name) &&
                nameDiscount.equals(((PricePlan)that).nameDiscount) &&
                discount == ((PricePlan)that).discount &&
                validity.equals(((PricePlan)that).validity);
    }

    @Override
    public int hashCode() {
        return discount + name.hashCode()  + 107;
    }
}


