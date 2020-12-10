package com.java.automation.lab.fall.kapinus.core22.service;

import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Training;
import com.java.automation.lab.fall.kapinus.core22.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class TrainingService extends BaseService{

    private static final Logger LOGGER = LoggerFactory.getLogger(TrainingService.class);

    private static final DAO<Training> TRAINING_DAO =
            TRAINING_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static Training createTraining(Training training) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to create {}", training);
        return TRAINING_DAO.create(training);
    }

    public static Training getTrainingById(Long id){
        LOGGER.info("Selecting training by Id " + id);
        return TRAINING_DAO.getById(id);
    }

    public static List<Training> get(){
        LOGGER.info("Selecting all trainings");
        return TRAINING_DAO.get();
    }

    public static Training update(Training training) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to update {}", training);
        return TRAINING_DAO.update(training);
    }

    public static Long deleteById(Long id){
        LOGGER.info("Deleting training by Id " + id);
        return TRAINING_DAO.deleteById(id);
    }
}
