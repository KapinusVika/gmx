package com.java.automation.lab.fall.kapinus.core22.service;

import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;

import com.java.automation.lab.fall.kapinus.core22.domain.NutritionProgram;
import com.java.automation.lab.fall.kapinus.core22.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class NutritionProgramService extends BaseService {

    private static final Logger LOGGER = LoggerFactory.getLogger(NutritionProgramService.class);

    private static final DAO<NutritionProgram> NUTRITION_PROGRAM_DAO=
            NUTRITION_PROGRAM_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static NutritionProgram createClient(NutritionProgram nutritionProgram) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to create {}", nutritionProgram);
        return NUTRITION_PROGRAM_DAO.create(nutritionProgram);
    }

    public static NutritionProgram getClientById(Long id){
        LOGGER.info("Selecting nutritionProgram by Id " + id);
        return NUTRITION_PROGRAM_DAO.getById(id);
    }

    public static List<NutritionProgram> get(){
        LOGGER.info("Selecting all nutritionPrograms");
        return NUTRITION_PROGRAM_DAO.get();
    }

    public static NutritionProgram update(NutritionProgram nutritionProgram) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to update {}", nutritionProgram);
        return NUTRITION_PROGRAM_DAO.update(nutritionProgram);
    }

    public  static Long deleteById(Long id){
        LOGGER.info("Deleting nutritionProgram by Id " + id);
        return NUTRITION_PROGRAM_DAO.deleteById(id);
    }

}
