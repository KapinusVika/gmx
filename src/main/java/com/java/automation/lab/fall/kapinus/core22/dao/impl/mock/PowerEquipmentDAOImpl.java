package com.java.automation.lab.fall.kapinus.core22.dao.impl.mock;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.PowerEquipment;
import com.java.automation.lab.fall.kapinus.core22.exceptions.NotImplementetExc;
import java.util.List;

public class PowerEquipmentDAOImpl implements DAO<PowerEquipment> {

    private static PowerEquipmentDAOImpl instance;

    public static synchronized PowerEquipmentDAOImpl getInstance() {
        if(instance == null){
            instance = new PowerEquipmentDAOImpl();
        }
        return instance;
    }

    @Override
    public PowerEquipment create(PowerEquipment o) {
        return new PowerEquipment(
                o.getName(),
                o.getYear(),
                o.getWorkingMuscle(),
                o.getMaxWorkingWeight()
        );
    }

    @Override
    public PowerEquipment getById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }

    @Override
    public List<PowerEquipment> get() {
        throw new NotImplementetExc("Method not implemented get");
    }

    @Override
    public PowerEquipment update(PowerEquipment o) {
        return new PowerEquipment(
                o.getName(),
                o.getYear(),
                o.getWorkingMuscle(),
                o.getMaxWorkingWeight()
        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementetExc("Method not implemented deleteById");
    }
}
