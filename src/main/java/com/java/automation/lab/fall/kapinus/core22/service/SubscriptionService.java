package com.java.automation.lab.fall.kapinus.core22.service;

import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;

import com.java.automation.lab.fall.kapinus.core22.domain.Subscription;
import com.java.automation.lab.fall.kapinus.core22.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class SubscriptionService extends BaseService{

    private static final Logger LOGGER = LoggerFactory.getLogger(SubscriptionService.class);

    private static final DAO<Subscription> SUBSCRIPTION_DAO =
            SUBSCRIPTION_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));


    public static Subscription createSubscription(Subscription subscription) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to create {}", subscription);
        return SUBSCRIPTION_DAO.create(subscription);
    }

    public static Subscription getSubscriptionById(Long id){
        LOGGER.info("Selecting subscription by Id " + id);
        return SUBSCRIPTION_DAO.getById(id);
    }

    public static List<Subscription> get(){
        LOGGER.info("Selecting all subscriptions");
        return SUBSCRIPTION_DAO.get();
    }

    public static Subscription update(Subscription subscription) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to update {}", subscription);
        return SUBSCRIPTION_DAO.update(subscription);
    }

    public static Long deleteById(Long id){
        LOGGER.info("Deleting subscription by Id " + id);
        return SUBSCRIPTION_DAO.deleteById(id);
    }

}
