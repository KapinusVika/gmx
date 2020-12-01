package com.java.automation.lab.fall.kapinus.core22.dao.service;

import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.CardioEquipment;

import java.util.List;


public class CardioEquipmentService extends BaseService {

    private static final DAO<CardioEquipment> CARDIO_EQUIPMENT_DAO =
            CARDIO_EQUIPMENT_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));


    public static CardioEquipment createCardioEquipment(CardioEquipment cardioEquipment){
        return CARDIO_EQUIPMENT_DAO.create(cardioEquipment);
    }

    public static CardioEquipment getCardioEquipmentById(Long id){
        return CARDIO_EQUIPMENT_DAO.getById(id);
    }

    public static List<CardioEquipment> get(){
        return CARDIO_EQUIPMENT_DAO.get();
    }

    public static CardioEquipment update(CardioEquipment cardioEquipment){
        return CARDIO_EQUIPMENT_DAO.update(cardioEquipment);
    }

    public  static Long deleteById(Long id){
        return CARDIO_EQUIPMENT_DAO.deleteById(id);
    }
}
