package java.automation.lab.fall.kapinus.core22.dao.impl.mock;

import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.NutritionProgram;
import java.automation.lab.fall.kapinus.core22.exceptions.NotImplementetExc;
import java.util.List;

public class NutritionProgramDAOImpl implements DAO<NutritionProgram> {

    private static NutritionProgramDAOImpl instance;

    public static synchronized NutritionProgramDAOImpl getInstance() {
        if(instance == null){
            instance = new NutritionProgramDAOImpl();
        }
        return instance;
    }
    @Override
    public NutritionProgram create(NutritionProgram nutritionProgram) {
        return new NutritionProgram(
                nutritionProgram.getNameDiet(),
                nutritionProgram.getNutritionFacts(),
                nutritionProgram.getExcludedProducts());
    }

    @Override
    public NutritionProgram getById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }

    @Override
    public List<NutritionProgram> get() {
        throw new NotImplementetExc("Method not implemented get");
    }

    @Override
    public NutritionProgram update(NutritionProgram nutritionProgram) {
        return new NutritionProgram(
                nutritionProgram.getNameDiet(),
                nutritionProgram.getNutritionFacts(),
                nutritionProgram.getExcludedProducts());

    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementetExc("Method not implemented deleteById");
    }
}
