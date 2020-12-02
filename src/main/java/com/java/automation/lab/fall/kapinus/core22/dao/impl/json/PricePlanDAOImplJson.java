package com.java.automation.lab.fall.kapinus.core22.dao.impl.json;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Adress;
import com.java.automation.lab.fall.kapinus.core22.domain.PricePlan;
import com.java.automation.lab.fall.kapinus.core22.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class PricePlanDAOImplJson implements DAO<PricePlan> {
    public PricePlan create(PricePlan o) {
        try {
            new JsonIO<>(PricePlan.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public PricePlan getById(Long id) {
        try {
            return new JsonIO<>(PricePlan.class).read(String.format(IOConstant.JSON_OBJ_PATH, PricePlan.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
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
