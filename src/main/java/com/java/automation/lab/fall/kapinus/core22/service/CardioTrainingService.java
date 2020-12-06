package com.java.automation.lab.fall.kapinus.core22.service;

import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.CardioTraining;
import com.java.automation.lab.fall.kapinus.core22.exceptions.*;

import java.util.List;

public class CardioTrainingService extends BaseService{
    private static final DAO<CardioTraining> CARDIO_TRAINING_DAO =
            CARDIO_TRAINING_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static CardioTraining createCardioTraining(CardioTraining cardioTraining) throws AgeClientException,
            InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        return CARDIO_TRAINING_DAO.create(cardioTraining);
    }

    public static CardioTraining getCardioTrainingById(Long id){
        return CARDIO_TRAINING_DAO.getById(id);
    }

    public static List<CardioTraining> get(){
        return CARDIO_TRAINING_DAO.get();
    }

    public static CardioTraining update(CardioTraining cardioTraining) throws AgeClientException,
            InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        return CARDIO_TRAINING_DAO.update(cardioTraining);
    }

    public  static Long deleteById(Long id){
        return CARDIO_TRAINING_DAO.deleteById(id);
    }
}
