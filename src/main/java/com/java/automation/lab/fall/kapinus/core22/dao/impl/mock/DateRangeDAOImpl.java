package com.java.automation.lab.fall.kapinus.core22.dao.impl.mock;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.DateRange;
import com.java.automation.lab.fall.kapinus.core22.exceptions.NotImplementetExc;

import java.util.List;

public class DateRangeDAOImpl implements DAO<DateRange> {
    private static DateRangeDAOImpl instance;

    public static synchronized DateRangeDAOImpl getInstance() {
        if(instance == null){
            instance = new DateRangeDAOImpl();
        }
        return instance;
    }

    @Override
    public DateRange create(DateRange dateRange) {
        return new DateRange(
                dateRange.getDateStart(),
                dateRange.getDateEnd()
        );
    }

    @Override
    public DateRange getById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }

    @Override
    public List<DateRange> get() {
        throw new NotImplementetExc("Method not implemented get");
    }

    @Override
    public DateRange update(DateRange dateRange) {
        return new DateRange(
                dateRange.getDateStart(),
                dateRange.getDateEnd()
        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementetExc("Method not implemented deleteById");
    }
}
