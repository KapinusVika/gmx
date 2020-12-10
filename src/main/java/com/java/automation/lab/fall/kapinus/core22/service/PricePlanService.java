package com.java.automation.lab.fall.kapinus.core22.service;

import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.PricePlan;
import com.java.automation.lab.fall.kapinus.core22.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class PricePlanService extends BaseService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PricePlanService.class);

    private static final DAO<PricePlan> PRICE_PLAN_DAO =
            PRICE_PLAN_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static PricePlan createPricePlan(PricePlan pricePlan) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to create {}", pricePlan);
        return PRICE_PLAN_DAO.create(pricePlan);
    }

    public static PricePlan getPricePlanById(Long id){
        LOGGER.info("Selecting pricePlan by Id " + id);
        return PRICE_PLAN_DAO.getById(id);
    }

    public static List<PricePlan> get(){
        LOGGER.info("Selecting all pricePlans");
        return PRICE_PLAN_DAO.get();
    }

    public static PricePlan update(PricePlan pricePlan) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to update {}", pricePlan);
        return PRICE_PLAN_DAO.update(pricePlan);
    }

    public  static Long deleteById(Long id){
        LOGGER.info("Deleting pricePlan by Id " + id);
        return PRICE_PLAN_DAO.deleteById(id);
    }
}
