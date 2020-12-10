package com.java.automation.lab.fall.kapinus.core22.service;

import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.DateRange;
import com.java.automation.lab.fall.kapinus.core22.exceptions.*;

import java.util.List;

public class DateRangeService extends BaseService{
    private static final DAO<DateRange> DATE_RANGE_DAO = DATE_RANGE_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static DateRange createDateRange(DateRange DateRange) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        return DATE_RANGE_DAO.create(DateRange);
    }

    public static DateRange DateRange(Long id){
        return DATE_RANGE_DAO.getById(id);
    }

    public static List<DateRange> get(){
        return DATE_RANGE_DAO.get();
    }

    public static DateRange update(DateRange DateRange) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        return DATE_RANGE_DAO.update(DateRange);
    }

    public  static Long deleteById(Long id){
        return DATE_RANGE_DAO.deleteById(id);
    }
}
