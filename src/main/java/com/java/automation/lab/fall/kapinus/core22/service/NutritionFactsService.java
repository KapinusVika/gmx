package com.java.automation.lab.fall.kapinus.core22.service;

import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.dao.daoModel.NutritionFactsDAO;

import com.java.automation.lab.fall.kapinus.core22.domain.NutritionFacts;
import com.java.automation.lab.fall.kapinus.core22.exceptions.InvalidCaloriesException;

import java.util.List;

public class NutritionFactsService extends BaseService {

    private static final DAO<NutritionFacts> NUTRITION_FACTS_DAO=
            NUTRITION_FACTS_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static NutritionFacts createNutritionFacts(NutritionFacts nutritionFacts) throws InvalidCaloriesException {
        return NUTRITION_FACTS_DAO.create(nutritionFacts);
    }

    public static NutritionFacts getNutritionFactsById(Long id){
        return NUTRITION_FACTS_DAO.getById(id);
    }

    public static List<NutritionFacts> get(){
        return NUTRITION_FACTS_DAO.get();
    }

    public static NutritionFacts update(NutritionFacts nutritionFacts) throws InvalidCaloriesException {
        return NUTRITION_FACTS_DAO.update(nutritionFacts);
    }

    public  static Long deleteById(Long id){
        return NUTRITION_FACTS_DAO.deleteById(id);
    }
}

