package com.java.automation.lab.fall.kapinus.core22.service;

import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.PowerTraining;
import com.java.automation.lab.fall.kapinus.core22.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class PowerTrainingService extends BaseService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PowerTrainingService.class);

    private static final DAO<PowerTraining> POWER_TRAINING_DAO =
            POWER_TRAINING_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static PowerTraining createPowerTraining(PowerTraining powerTraining) throws AgeClientException,
            InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to create {}", powerTraining);
        return POWER_TRAINING_DAO.create(powerTraining);
    }

    public static PowerTraining getPowerTrainingById(Long id){
        LOGGER.info("Selecting powerTraining by Id " + id);
        return POWER_TRAINING_DAO.getById(id);
    }

    public static List<PowerTraining> get(){
        LOGGER.info("Selecting all powerTrainings");
        return POWER_TRAINING_DAO.get();
    }

    public static PowerTraining update(PowerTraining powerTraining) throws AgeClientException,
            InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to update {}", powerTraining);
        return POWER_TRAINING_DAO.update(powerTraining);
    }

    public  static Long deleteById(Long id){
        LOGGER.info("Deleting powerTraining by Id " + id);
        return POWER_TRAINING_DAO.deleteById(id);
    }

}
