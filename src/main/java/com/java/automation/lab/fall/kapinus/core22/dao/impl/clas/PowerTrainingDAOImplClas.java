package com.java.automation.lab.fall.kapinus.core22.dao.impl.clas;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Adress;
import com.java.automation.lab.fall.kapinus.core22.domain.PowerTraining;
import com.java.automation.lab.fall.kapinus.core22.io.ObjectIO;

import java.util.List;

public class PowerTrainingDAOImplClas implements DAO<PowerTraining> {
    @Override
    public PowerTraining create(PowerTraining o) {
        new ObjectIO<PowerTraining>().write(o, IOConstant.RQ_PATH);
        return o;

    }

    @Override
    public PowerTraining getById(Long id) {
        return new ObjectIO<PowerTraining>().read(IOConstant.RQ_PATH);
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
