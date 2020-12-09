package com.java.automation.lab.fall.kapinus.core22.service;

import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;

import com.java.automation.lab.fall.kapinus.core22.domain.Subscription;
import com.java.automation.lab.fall.kapinus.core22.exceptions.*;

import java.util.List;

public class SubscriptionService extends BaseService{

    private static final DAO<Subscription> SUBSCRIPTION_DAO =
            SUBSCRIPTION_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));


    public static Subscription createSubscription(Subscription subscription) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        return SUBSCRIPTION_DAO.create(subscription);
    }

    public static Subscription getSubscriptionById(Long id){
        return SUBSCRIPTION_DAO.getById(id);
    }

    public static List<Subscription> get(){
        return SUBSCRIPTION_DAO.get();
    }

    public static Subscription update(Subscription subscription) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        return SUBSCRIPTION_DAO.update(subscription);
    }

    public static Long deleteById(Long id){
        return SUBSCRIPTION_DAO.deleteById(id);
    }

}
