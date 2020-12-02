package com.java.automation.lab.fall.kapinus.core22.dao.impl.json;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.CardioEquipment;
import com.java.automation.lab.fall.kapinus.core22.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class CardioEquipmentDAOImplJson implements DAO<CardioEquipment> {
    public CardioEquipment create(CardioEquipment o) {
        try {
            new JsonIO<>(CardioEquipment.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public CardioEquipment getById(Long id) {
        try {
            return new JsonIO<>(CardioEquipment.class).read(String.format(IOConstant.JSON_OBJ_PATH, CardioEquipment.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<CardioEquipment> get() {
        return null;
    }

    @Override
    public CardioEquipment update(CardioEquipment o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
