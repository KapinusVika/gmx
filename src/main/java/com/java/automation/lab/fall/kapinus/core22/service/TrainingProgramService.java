package com.java.automation.lab.fall.kapinus.core22.service;

import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.TrainingProgram;
import com.java.automation.lab.fall.kapinus.core22.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class TrainingProgramService extends BaseService{

    private static final Logger LOGGER = LoggerFactory.getLogger(TrainingProgramService.class);

    private static final DAO<TrainingProgram> TRAINING_PROGRAM_DAO =
            TRAINING_PROGRAM_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static TrainingProgram createTrainingProgram(TrainingProgram trainingProgram) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to create {}", trainingProgram);
        return TRAINING_PROGRAM_DAO.create(trainingProgram);
    }

    public static TrainingProgram getTrainingProgramById(Long id){
        LOGGER.info("Selecting trainingProgram by Id " + id);
        return TRAINING_PROGRAM_DAO.getById(id);
    }

    public static List<TrainingProgram> get(){
        LOGGER.info("Selecting all trainingPrograms");
        return TRAINING_PROGRAM_DAO.get();
    }

    public static TrainingProgram update(TrainingProgram trainingProgram) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to update {}", trainingProgram);
        return TRAINING_PROGRAM_DAO.update(trainingProgram);
    }

    public  static Long deleteById(Long id){
        LOGGER.info("Deleting trainingProgram by Id " + id);
        return TRAINING_PROGRAM_DAO.deleteById(id);
    }
}
