package com.java.automation.lab.fall.kapinus.core22.service;

import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.GroupTraining;
import com.java.automation.lab.fall.kapinus.core22.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class GroupTrainingService extends BaseService {

    private static final Logger LOGGER = LoggerFactory.getLogger(GroupTrainingService.class);

    private static final DAO<GroupTraining> GROUP_TRAINING_DAO=
            GROUP_TRAINING_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));


    public static GroupTraining createGroupTraining(GroupTraining groupTraining) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to create {}", groupTraining);
        return GROUP_TRAINING_DAO.create(groupTraining);
    }

    public static GroupTraining getGroupTrainingById(Long id){
        LOGGER.info("Selecting groupTraining by Id " + id);
        return GROUP_TRAINING_DAO.getById(id);
    }

    public static List<GroupTraining> get(){
        LOGGER.info("Selecting all groupTrainings");
        return GROUP_TRAINING_DAO.get();
    }

    public static GroupTraining update(GroupTraining groupTraining) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to update {}", groupTraining);
        return GROUP_TRAINING_DAO.update(groupTraining);
    }

    public  static Long deleteById(Long id){
        LOGGER.info("Deleting groupTraining by Id " + id);
        return GROUP_TRAINING_DAO.deleteById(id);
    }
}
