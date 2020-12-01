package com.java.automation.lab.fall.kapinus.core22.dao.impl.xml;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;

import javax.xml.bind.JAXBException;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.PricePlan;
import com.java.automation.lab.fall.kapinus.core22.io.XMLIO;

import java.util.List;

public class PricePlanDAOImplXml implements DAO<PricePlan> {
    @Override
    public PricePlan create(PricePlan o) {
        try {
            new XMLIO<>(PricePlan.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public PricePlan getById(Long id) {
        return null;
    }

    @Override
    public List<PricePlan> get() {
        return null;
    }


    @Override
    public PricePlan update(PricePlan o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
