package com.java.automation.lab.fall.kapinus.core22.dao.impl.json;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Adress;
import com.java.automation.lab.fall.kapinus.core22.domain.DateRange;
import com.java.automation.lab.fall.kapinus.core22.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class DateRangeDAOImplJson implements DAO<DateRange> {

    public DateRange create(DateRange o) {
        try {
            new JsonIO<>(DateRange.class)
                    .write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public DateRange getById(Long id) {
        try {
            return new JsonIO<>(DateRange.class)
                    .read(String.format(IOConstant.JSON_OBJ_PATH, DateRange.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
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
