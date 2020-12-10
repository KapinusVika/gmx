package com.java.automation.lab.fall.kapinus.core22.service;

import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.CardioEquipment;
import com.java.automation.lab.fall.kapinus.core22.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class CardioEquipmentService extends BaseService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CardioEquipmentService.class);

    private static final DAO<CardioEquipment> CARDIO_EQUIPMENT_DAO =
            CARDIO_EQUIPMENT_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));


    public static CardioEquipment createCardioEquipment(CardioEquipment cardioEquipment) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to create {}", cardioEquipment);
        return CARDIO_EQUIPMENT_DAO.create(cardioEquipment);
    }

    public static CardioEquipment getCardioEquipmentById(Long id){
        LOGGER.info("Selecting cardioEquipment by Id " + id);
        return CARDIO_EQUIPMENT_DAO.getById(id);
    }

    public static List<CardioEquipment> get(){
        LOGGER.info("Selecting all cardioEquipments");
        return CARDIO_EQUIPMENT_DAO.get();
    }

    public static CardioEquipment update(CardioEquipment cardioEquipment) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to update {}", cardioEquipment);
        return CARDIO_EQUIPMENT_DAO.update(cardioEquipment);
    }

    public  static Long deleteById(Long id){
        LOGGER.info("Deleting cardioEquipment by Id " + id);
        return CARDIO_EQUIPMENT_DAO.deleteById(id);
    }
}
