package java.automation.lab.fall.kapinus.core22.enums;

public enum AgeGroups {
    CHILDREN("10 - 16 years", "no restrictions"),
    ADULT("17 - 45 years", "heart disease"),
    ELDERLY("45 - 70 years", "heart disease, joint diseases");

    private String description;
    private String restrictions;

    AgeGroups(String description, String restrictions) {
        this.description = description;
        this.restrictions = restrictions;
    }

    public String description(){
        return description;
    }

    public String restrictions() {
        return restrictions;
    }
}