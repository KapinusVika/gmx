package com.java.automation.lab.fall.kapinus.core22.service;

import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Training;
import com.java.automation.lab.fall.kapinus.core22.exceptions.*;

import java.util.List;

public class TrainingService extends BaseService{

    private static final DAO<Training> TRAINING_DAO =
            TRAINING_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static Training createTraining(Training training) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        return TRAINING_DAO.create(training);
    }

    public static Training getTrainingById(Long id){
        return TRAINING_DAO.getById(id);
    }

    public static List<Training> get(){
        return TRAINING_DAO.get();
    }

    public static Training update(Training training) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        return TRAINING_DAO.update(training);
    }

    public static Long deleteById(Long id){
        return TRAINING_DAO.deleteById(id);
    }
}
