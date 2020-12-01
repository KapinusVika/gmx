package com.java.automation.lab.fall.kapinus.core22.dao.impl.clas;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Trainer;
import com.java.automation.lab.fall.kapinus.core22.io.ObjectIO;

import java.util.List;

public class TrainerDAOImplClas implements DAO<Trainer> {

    @Override
    public Trainer create(Trainer o) {
        new ObjectIO<Trainer>().write(o, IOConstant.RQ_PATH);
        return o;
    }

    @Override
    public Trainer getById(Long id) {
        return new ObjectIO<Trainer>().read(IOConstant.RQ_PATH);
    }

    @Override
    public List<Trainer> get() {
        return null;
    }

    @Override
    public Trainer update(Trainer o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}