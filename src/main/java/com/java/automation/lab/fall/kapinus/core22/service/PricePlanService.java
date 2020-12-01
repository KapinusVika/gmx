package com.java.automation.lab.fall.kapinus.core22.service;

import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.PricePlan;

import java.util.List;

public class PricePlanService extends BaseService {

    private static final DAO<PricePlan> PRICE_PLAN_DAO =
            PRICE_PLAN_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static PricePlan createPricePlan(PricePlan pricePlan) {
        return PRICE_PLAN_DAO.create(pricePlan);
    }

    public static PricePlan getPricePlanById(Long id){
        return PRICE_PLAN_DAO.getById(id);
    }

    public static List<PricePlan> get(){
        return PRICE_PLAN_DAO.get();
    }

    public static PricePlan update(PricePlan pricePlan){
        return PRICE_PLAN_DAO.update(pricePlan);
    }

    public  static Long deleteById(Long id){
        return PRICE_PLAN_DAO.deleteById(id);
    }
}
