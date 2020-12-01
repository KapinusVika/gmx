package com.java.automation.lab.fall.kapinus.core22.domain;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlRootElement(name = "OpeningHours")
@XmlType(propOrder = { "open", "close"})
public class OpeningHours implements Serializable {
    double open;
    double close;


    public OpeningHours (double open, double close) {
        this.open = open;
        this.close = close;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    @Override
    public String toString() {
        return "OpeningHours {\n\topen:" + Double.toString(open) +
                "\n\tclose:" + Double.toString(close) +
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
        return  open == ((OpeningHours)that).open &&
                close == ((OpeningHours)that).close;
    }

    @Override
    public int hashCode() {
        String o = Double.toString(open);
        String c = Double.toString(close);
        return ((o.hashCode() * 11) + c.hashCode());
    }

}