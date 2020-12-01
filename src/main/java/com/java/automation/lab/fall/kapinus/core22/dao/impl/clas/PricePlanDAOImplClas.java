package com.java.automation.lab.fall.kapinus.core22.dao.impl.clas;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.io.ObjectIO;
import com.java.automation.lab.fall.kapinus.core22.domain.PricePlan;

import java.util.List;

public class PricePlanDAOImplClas implements DAO<PricePlan> {

    @Override
    public PricePlan create(PricePlan o) {
        new ObjectIO<PricePlan>().write(o, IOConstant.RQ_PATH);
        return o;
    }

    @Override
    public PricePlan getById(Long id) {
        return new ObjectIO<PricePlan>().read(IOConstant.RQ_PATH);

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