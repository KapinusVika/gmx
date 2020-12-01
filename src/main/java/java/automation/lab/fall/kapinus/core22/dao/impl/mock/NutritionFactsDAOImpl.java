package java.automation.lab.fall.kapinus.core22.dao.impl.mock;

import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.NutritionFacts;
import java.automation.lab.fall.kapinus.core22.exceptions.InvalidCaloriesException;
import java.automation.lab.fall.kapinus.core22.exceptions.NotImplementetExc;
import java.util.List;

public class NutritionFactsDAOImpl implements DAO<NutritionFacts> {

    private static NutritionFactsDAOImpl instance;

    public static synchronized NutritionFactsDAOImpl getInstance() {
        if(instance == null){
            instance = new NutritionFactsDAOImpl();
        }
        return instance;
    }

    @Override
    public NutritionFacts create(NutritionFacts nutritionFacts) throws InvalidCaloriesException {
        return new NutritionFacts(
                nutritionFacts.getCaloriesPerDay(),
                nutritionFacts.getProteinPerDay(),
                nutritionFacts.getCarbohydratesPerDay(),
                nutritionFacts.getFatsPerDay()
        );
    }

    @Override
    public NutritionFacts getById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }

    @Override
    public List<NutritionFacts> get() {
        throw new NotImplementetExc("Method not implemented get");
    }

    @Override
    public NutritionFacts update(NutritionFacts nutritionFacts) throws InvalidCaloriesException {
        return new NutritionFacts(
                nutritionFacts.getCaloriesPerDay(),
                nutritionFacts.getProteinPerDay(),
                nutritionFacts.getCarbohydratesPerDay(),
                nutritionFacts.getFatsPerDay()
        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementetExc("Method not implemented deleteById");
    }
}


