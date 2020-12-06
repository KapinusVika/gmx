package com.java.automation.lab.fall.kapinus.core22.dao.impl.clas;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.CardioTraining;
import com.java.automation.lab.fall.kapinus.core22.io.ObjectIO;

import java.util.List;

public class CardioTrainingDAOImplClas implements DAO<CardioTraining> {
    @Override
    public CardioTraining create(CardioTraining o) {
        new ObjectIO<CardioTraining>().write(o, IOConstant.RQ_PATH);
        return o;

    }

    @Override
    public CardioTraining getById(Long id) {
        return new ObjectIO<CardioTraining>().read(IOConstant.RQ_PATH);
    }

    @Override
    public List<CardioTraining> get() {
        return null;
    }

    @Override
    public CardioTraining update(CardioTraining o) {
        return null;

    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
