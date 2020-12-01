package com.java.automation.lab.fall.kapinus.core22.domain;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.EnumSet;

@XmlRootElement(name = "Schedule")
@XmlType(propOrder = { "weekendDay"})
public class Schedule implements Serializable {
    private EnumSet weekendDay;

    public Schedule(EnumSet weekendDay){
        this.weekendDay = weekendDay;
    }
//    Schedule gymWeekend = new Schedule(EnumSet.of(DayOfWeek.SUNDAY));  Это пример, как оно работает


    public EnumSet getWeekendDay() {
        return weekendDay;
    }

    public void setWeekendDay(EnumSet weekendDay) {
        this.weekendDay = weekendDay;
    }
}


