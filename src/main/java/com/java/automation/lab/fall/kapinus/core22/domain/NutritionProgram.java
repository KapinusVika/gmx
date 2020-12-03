package com.java.automation.lab.fall.kapinus.core22.domain;

import com.java.automation.lab.fall.kapinus.core22.dao.abstractModel.AbstractModel;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlRootElement(name = "NutritionProgram")
@XmlType(propOrder = { "nameDiet", "nutritionFacts", "excludedProducts"})
public class NutritionProgram extends AbstractModel implements Serializable{
    private String nameDiet;
    private NutritionFacts nutritionFacts;
    private String excludedProducts;

    public NutritionProgram(String nameDiet, NutritionFacts nutritionFacts, String excludedProducts){
        this.nameDiet = nameDiet;
        this.nutritionFacts = nutritionFacts;
        this.excludedProducts = excludedProducts;
    }

    public String getNameDiet() {
        return nameDiet;
    }

    public void setNameDiet(String nameDiet) {
        this.nameDiet = nameDiet;
    }

    public NutritionFacts getNutritionFacts() {
        return nutritionFacts;
    }

    public void setNutritionFacts(NutritionFacts nutritionFacts) {
        this.nutritionFacts = nutritionFacts;
    }

    public String getExcludedProducts() {
        return excludedProducts;
    }

    public void setExcludedProducts(String excludedProducts) {
        this.excludedProducts = excludedProducts;
    }

    @Override
    public String toString() {
        return "NutritionProgram {\n\tnameDiet:" + nameDiet +
                "\n\tnutritionFacts:" + nutritionFacts +
                "\n\texcludedProducts:" + excludedProducts +
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
        return  nameDiet.equals(((NutritionProgram)that).nameDiet) &&
                nutritionFacts.equals(((NutritionProgram)that).nutritionFacts) &&
                excludedProducts.equals(((NutritionProgram)that).excludedProducts);
    }

    @Override
    public int hashCode() {
        return (excludedProducts.hashCode() + nameDiet.hashCode()) * 7;
    }
}