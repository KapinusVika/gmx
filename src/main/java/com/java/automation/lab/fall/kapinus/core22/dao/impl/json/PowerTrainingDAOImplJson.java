package com.java.automation.lab.fall.kapinus.core22.dao.impl.json;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.PowerTraining;
import com.java.automation.lab.fall.kapinus.core22.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class PowerTrainingDAOImplJson implements DAO<PowerTraining> {
    public PowerTraining create(PowerTraining o) {
        try {
            new JsonIO<>(PowerTraining.class)
                    .write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public PowerTraining getById(Long id) {
        try {
            return new JsonIO<>(PowerTraining.class)
                    .read(String.format(IOConstant.JSON_OBJ_PATH, PowerTraining.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<PowerTraining> get() {
        return null;
    }

    @Override
    public PowerTraining update(PowerTraining o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
