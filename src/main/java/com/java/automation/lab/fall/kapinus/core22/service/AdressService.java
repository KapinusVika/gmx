package com.java.automation.lab.fall.kapinus.core22.service;


import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Adress;
import com.java.automation.lab.fall.kapinus.core22.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class AdressService extends BaseService{

    private static final Logger LOGGER = LoggerFactory.getLogger(AdressService.class);

    private static final DAO<Adress> ADRESS_DAO = ADRESS_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static Adress createAdress(Adress adress) throws AgeClientException, InvalidDiscountException,
            InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to create {}", adress);
        return ADRESS_DAO.create(adress);
    }

    public static Adress getAdressById(Long id){
        LOGGER.info("Selecting adress by Id " + id);
        return ADRESS_DAO.getById(id);
    }

    public static List<Adress> get(){
        LOGGER.info("Selecting all adresses");
        return ADRESS_DAO.get();
    }

    public static Adress update(Adress adress) throws AgeClientException, InvalidDiscountException,
            InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to update {}", adress);
        return ADRESS_DAO.update(adress);
    }

    public  static Long deleteById(Long id){
        LOGGER.info("Deleting adress by Id " + id);
        return ADRESS_DAO.deleteById(id);
    }
}
