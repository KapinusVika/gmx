package com.java.automation.lab.fall.kapinus.core22.domain;

import java.util.EnumSet;

public class Schedule {
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


