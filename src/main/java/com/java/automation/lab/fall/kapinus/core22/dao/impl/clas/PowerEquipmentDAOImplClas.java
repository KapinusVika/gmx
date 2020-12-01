package com.java.automation.lab.fall.kapinus.core22.dao.impl.clas;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.io.ObjectIO;
import com.java.automation.lab.fall.kapinus.core22.domain.PowerEquipment;

import java.util.List;

public class PowerEquipmentDAOImplClas implements DAO<PowerEquipment> {

    @Override
    public PowerEquipment create(PowerEquipment o) {
        new ObjectIO<PowerEquipment>().write(o, IOConstant.RQ_PATH);
        return o;
    }

    @Override
    public PowerEquipment getById(Long id) {
        return new ObjectIO<PowerEquipment>().read(IOConstant.RQ_PATH);
    }

    @Override
    public List<PowerEquipment> get() {
        return null;
    }

    @Override
    public PowerEquipment update(PowerEquipment o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}