package com.java.automation.lab.fall.kapinus.core22.dao.impl.clas;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.DateRange;
import com.java.automation.lab.fall.kapinus.core22.io.ObjectIO;

import java.util.List;

public class DateRangeDAOImplClas implements DAO<DateRange> {
    @Override
    public DateRange create(DateRange o) {
        new ObjectIO<DateRange>().write(o, IOConstant.RQ_PATH);
        return o;
    }

    @Override
    public DateRange getById(Long id) {
        return new ObjectIO<DateRange>().read(IOConstant.RQ_PATH);
    }

    @Override
    public List<DateRange> get() {
        return null;
    }

    @Override
    public DateRange update(DateRange o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
