package com.java.automation.lab.fall.kapinus.core22.dao.impl.json;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.CardioTraining;
import com.java.automation.lab.fall.kapinus.core22.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class CardioTrainingDAOImplJson implements DAO<CardioTraining> {
    public CardioTraining create(CardioTraining o) {
        try {
            new JsonIO<>(CardioTraining.class)
                    .write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public CardioTraining getById(Long id) {
        try {
            return new JsonIO<>(CardioTraining.class)
                    .read(String.format(IOConstant.JSON_OBJ_PATH, CardioTraining.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
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
