package com.java.automation.lab.fall.kapinus.core22.service;

import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.PowerTraining;
import com.java.automation.lab.fall.kapinus.core22.exceptions.*;

import java.util.List;

public class PowerTrainingService extends BaseService {
    private static final DAO<PowerTraining> POWER_TRAINING_DAO =
            POWER_TRAINING_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static PowerTraining createPowerTraining(PowerTraining powerTraining) throws AgeClientException,
            InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        return POWER_TRAINING_DAO.create(powerTraining);
    }

    public static PowerTraining getPowerTrainingById(Long id){
        return POWER_TRAINING_DAO.getById(id);
    }

    public static List<PowerTraining> get(){
        return POWER_TRAINING_DAO.get();
    }

    public static PowerTraining update(PowerTraining powerTraining) throws AgeClientException,
            InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        return POWER_TRAINING_DAO.update(powerTraining);
    }

    public  static Long deleteById(Long id){
        return POWER_TRAINING_DAO.deleteById(id);
    }

}
