package com.java.automation.lab.fall.kapinus.core22.service;

import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.PowerEquipment;
import com.java.automation.lab.fall.kapinus.core22.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class PowerEquipmentService extends BaseService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PowerEquipmentService.class);

    private static final DAO<PowerEquipment> POWER_EQUIPMENT_DAO =
            POWER_EQUIPMENT_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static PowerEquipment createPowerEquipment(PowerEquipment powerEquipment) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to create {}", powerEquipment);
        return POWER_EQUIPMENT_DAO.create(powerEquipment);
    }

    public static PowerEquipment getPowerEquipmentById(Long id){
        LOGGER.info("Selecting powerEquipment by Id " + id);
        return POWER_EQUIPMENT_DAO.getById(id);
    }

    public static List<PowerEquipment> get(){
        LOGGER.info("Selecting all powerEquipments");
        return POWER_EQUIPMENT_DAO.get();
    }

    public static PowerEquipment update(PowerEquipment powerEquipment) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to update {}", powerEquipment);
        return POWER_EQUIPMENT_DAO.update(powerEquipment);
    }

    public  static Long deleteById(Long id){
        LOGGER.info("Deleting powerEquipment by Id " + id);
        return POWER_EQUIPMENT_DAO.deleteById(id);
    }
}
