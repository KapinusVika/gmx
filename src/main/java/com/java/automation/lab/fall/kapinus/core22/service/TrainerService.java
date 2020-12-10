package com.java.automation.lab.fall.kapinus.core22.service;

import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Trainer;
import com.java.automation.lab.fall.kapinus.core22.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class TrainerService extends BaseService{

    private static final Logger LOGGER = LoggerFactory.getLogger(TrainerService.class);

    private static final DAO<Trainer> TRAINER_DAO =
            TRAINER_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static Trainer createTrainer(Trainer trainer) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to create {}", trainer);
        return TRAINER_DAO.create(trainer);
    }

    public static Trainer getTrainerById(Long id){
        LOGGER.info("Selecting trainer by Id " + id);
        return TRAINER_DAO.getById(id);
    }

    public static List<Trainer> get(){
        LOGGER.info("Selecting all trainers");
        return TRAINER_DAO.get();
    }

    public static Trainer update(Trainer trainer) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to update {}", trainer);
        return TRAINER_DAO.update(trainer);
    }

    public  static Long deleteById(Long id){
        LOGGER.info("Deleting trainer by Id " + id);
        return TRAINER_DAO.deleteById(id);
    }
}
