package java.automation.lab.fall.kapinus.core22.factory;

import java.automation.lab.fall.kapinus.core22.util.FileUtil;

public class Main {
    public static void main(String[] args){
        String pathAgeGroup = "src/resources/ageGroup.dict";
        FileUtil.overwrite("Children", pathAgeGroup);
        FileUtil.append("\nAdult", pathAgeGroup);
        FileUtil.append("\nElderly", pathAgeGroup);

        String pathTrainerSpecialization = "src/resources/trainerSpecialisation.dict";
        FileUtil.overwrite("Gym", pathTrainerSpecialization);
        FileUtil.append("\nBoxing", pathTrainerSpecialization);
        FileUtil.append("\nFitness", pathTrainerSpecialization);
        FileUtil.append("\nStretching", pathTrainerSpecialization);
        FileUtil.append("\nZumba", pathTrainerSpecialization);
        FileUtil.append("\nYoga", pathTrainerSpecialization);

        String pathPrice = "src/resources/price.dict";
        FileUtil.overwrite("Month", pathPrice);
        FileUtil.append("\nThreeMonth", pathPrice);
        FileUtil.append("\nMonthMorning", pathPrice);
        FileUtil.append("\nYears", pathPrice);
        FileUtil.append("\nOneTime", pathPrice);
        FileUtil.append("\nTrial", pathPrice);
        FileUtil.append("\nIndividual", pathPrice);

        String pathDiscount = "src/resources/discount.dict";
        FileUtil.overwrite("Family", pathDiscount);
        FileUtil.append("\nStudent", pathDiscount);
        FileUtil.append("\nSplit", pathDiscount);
        FileUtil.append("\nPensioner", pathDiscount);
        FileUtil.append("\nWeekend", pathDiscount);



    }

}
