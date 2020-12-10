package com.java.automation.lab.fall.kapinus.core22.service;

import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.DateRange;
import com.java.automation.lab.fall.kapinus.core22.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class DateRangeService extends BaseService{

    private static final Logger LOGGER = LoggerFactory.getLogger(DateRangeService.class);

    private static final DAO<DateRange> DATE_RANGE_DAO = DATE_RANGE_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static DateRange createDateRange(DateRange dateRange) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to create {}", dateRange);
        return DATE_RANGE_DAO.create(dateRange);
    }

    public static DateRange DateRange(Long id){
        LOGGER.info("Selecting dateRange by Id " + id);
        return DATE_RANGE_DAO.getById(id);
    }

    public static List<DateRange> get(){
        LOGGER.info("Selecting all dateRanges");
        return DATE_RANGE_DAO.get();
    }

    public static DateRange update(DateRange dateRange) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to update {}", dateRange);
        return DATE_RANGE_DAO.update(dateRange);
    }

    public  static Long deleteById(Long id){
        LOGGER.info("Deleting dateRange by Id " + id);
        return DATE_RANGE_DAO.deleteById(id);
    }
}
