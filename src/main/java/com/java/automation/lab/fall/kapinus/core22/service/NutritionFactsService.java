package com.java.automation.lab.fall.kapinus.core22.service;

import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;

import com.java.automation.lab.fall.kapinus.core22.domain.NutritionFacts;
import com.java.automation.lab.fall.kapinus.core22.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class NutritionFactsService extends BaseService {

    private static final Logger LOGGER = LoggerFactory.getLogger(NutritionFactsService.class);

    private static final DAO<NutritionFacts> NUTRITION_FACTS_DAO=
            NUTRITION_FACTS_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static NutritionFacts createNutritionFacts(NutritionFacts nutritionFacts) throws InvalidCaloriesException, AgeClientException, InvalidDiscountException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to create {}", nutritionFacts);
        return NUTRITION_FACTS_DAO.create(nutritionFacts);
    }

    public static NutritionFacts getNutritionFactsById(Long id){
        LOGGER.info("Selecting nutritionFacts by Id " + id);
        return NUTRITION_FACTS_DAO.getById(id);
    }

    public static List<NutritionFacts> get(){
        LOGGER.info("Selecting all nutritionFacts");
        return NUTRITION_FACTS_DAO.get();
    }

    public static NutritionFacts update(NutritionFacts nutritionFacts) throws InvalidCaloriesException, AgeClientException, InvalidDiscountException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to update {}", nutritionFacts);
        return NUTRITION_FACTS_DAO.update(nutritionFacts);
    }

    public  static Long deleteById(Long id){
        LOGGER.info("Deleting nutritionFacts by Id " + id);
        return NUTRITION_FACTS_DAO.deleteById(id);
    }
}

