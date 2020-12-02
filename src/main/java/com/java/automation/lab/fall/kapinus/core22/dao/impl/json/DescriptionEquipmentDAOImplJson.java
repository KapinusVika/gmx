package com.java.automation.lab.fall.kapinus.core22.dao.impl.json;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.DescriptionEquipment;
import com.java.automation.lab.fall.kapinus.core22.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class DescriptionEquipmentDAOImplJson implements DAO<DescriptionEquipment> {
    public DescriptionEquipment create(DescriptionEquipment o) {
        try {
            new JsonIO<>(DescriptionEquipment.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public DescriptionEquipment getById(Long id) {
        try {
            return new JsonIO<>(DescriptionEquipment.class)
                    .read(String.format(IOConstant.JSON_OBJ_PATH, DescriptionEquipment.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<DescriptionEquipment> get() {
        return null;
    }

    @Override
    public DescriptionEquipment update(DescriptionEquipment o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
