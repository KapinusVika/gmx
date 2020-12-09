package com.java.automation.lab.fall.kapinus.core22.service;

import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.TrainingProgram;
import com.java.automation.lab.fall.kapinus.core22.exceptions.*;

import java.util.List;

public class TrainingProgramService extends BaseService{

    private static final DAO<TrainingProgram> TRAINING_PROGRAM_DAO =
            TRAINING_PROGRAM_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static TrainingProgram createTrainingProgram(TrainingProgram trainingProgram) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        return TRAINING_PROGRAM_DAO.create(trainingProgram);
    }

    public static TrainingProgram getTrainingProgramById(Long id){
        return TRAINING_PROGRAM_DAO.getById(id);
    }

    public static List<TrainingProgram> get(){
        return TRAINING_PROGRAM_DAO.get();
    }

    public static TrainingProgram update(TrainingProgram trainingProgram) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        return TRAINING_PROGRAM_DAO.update(trainingProgram);
    }

    public  static Long deleteById(Long id){
        return TRAINING_PROGRAM_DAO.deleteById(id);
    }
}
