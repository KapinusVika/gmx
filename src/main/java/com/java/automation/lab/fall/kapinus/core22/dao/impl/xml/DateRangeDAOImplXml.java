package com.java.automation.lab.fall.kapinus.core22.dao.impl.xml;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.DateRange;
import com.java.automation.lab.fall.kapinus.core22.io.XMLIO;

import javax.xml.bind.JAXBException;
import java.util.List;

public class DateRangeDAOImplXml implements DAO<DateRange> {
    @Override
    public DateRange create(DateRange o) {
        try {
            new XMLIO<>(DateRange.class)
                    .write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public DateRange getById(Long id) {
        return null;
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
