package com.java.automation.lab.fall.kapinus.core22.service;

import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.CardioTraining;
import com.java.automation.lab.fall.kapinus.core22.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CardioTrainingService extends BaseService{

    private static final Logger LOGGER = LoggerFactory.getLogger(CardioTrainingService.class);

    private static final DAO<CardioTraining> CARDIO_TRAINING_DAO =
            CARDIO_TRAINING_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static CardioTraining createCardioTraining(CardioTraining cardioTraining) throws AgeClientException,
            InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to create {}", cardioTraining);
        return CARDIO_TRAINING_DAO.create(cardioTraining);
    }

    public static CardioTraining getCardioTrainingById(Long id){
        LOGGER.info("Selecting cardioTraining by Id " + id);
        return CARDIO_TRAINING_DAO.getById(id);
    }

    public static List<CardioTraining> get(){
        LOGGER.info("Selecting all cardioTrainings");
        return CARDIO_TRAINING_DAO.get();
    }

    public static CardioTraining update(CardioTraining cardioTraining) throws AgeClientException,
            InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to update {}", cardioTraining);
        return CARDIO_TRAINING_DAO.update(cardioTraining);
    }

    public  static Long deleteById(Long id){
        LOGGER.info("Deleting cardioTraining by Id " + id);
        return CARDIO_TRAINING_DAO.deleteById(id);
    }
}
