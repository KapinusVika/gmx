package com.java.automation.lab.fall.kapinus.core22.domain;

import java.time.OffsetDateTime;

public class DateRange {
    private OffsetDateTime dateStart;
    private OffsetDateTime dateEnd;

    public DateRange(OffsetDateTime dateStart, OffsetDateTime dateEnd){
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    public OffsetDateTime getDateStart() {
        return dateStart;
    }

    public void setDateStart(OffsetDateTime dateStart) {
        this.dateStart = dateStart;
    }

    public OffsetDateTime getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(OffsetDateTime dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Override
    public String toString() {
        return "DateRange {\n\tdateStart:" + dateStart +
                "\n\tdateEnd:" + dateEnd + "\n}";
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
        return  dateStart.equals(((DateRange)that).dateStart) &&
                dateEnd.equals(((DateRange)that).dateEnd);
    }

    @Override
    public int hashCode() {
        return (dateStart.hashCode() + dateEnd.hashCode()) * 5;
    }
}


