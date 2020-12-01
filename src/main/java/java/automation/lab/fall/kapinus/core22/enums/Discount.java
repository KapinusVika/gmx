package java.automation.lab.fall.kapinus.core22.enums;

public enum Discount {
    FAMILY("for married"),
    STUDENT("upon presentation of a student card"),
    SPLIT("for 2 persons"),
    PENSIONER("upon presentation of a pension certificate"),
    WEEKEND("valid on Saturdays and Sundays");

    private String terms;

    Discount(String terms){
        this.terms = terms;
    }

    public String terms(){
        return terms;
    }
}