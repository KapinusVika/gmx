package com.java.automation.lab.fall.kapinus.core22.dao.impl.mock;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.PowerTraining;
import com.java.automation.lab.fall.kapinus.core22.exceptions.NotImplementetExc;

import java.util.List;

public class PowerTrainingDAOImpl implements DAO<PowerTraining> {
    private static PowerTrainingDAOImpl instance;

    public static synchronized PowerTrainingDAOImpl getInstance() {
        if(instance == null){
            instance = new PowerTrainingDAOImpl();
        }
        return instance;
    }

    @Override
    public PowerTraining create(PowerTraining powerTraining) {
        return new PowerTraining(
                powerTraining.getEquipment(),
                powerTraining.getName(),
                powerTraining.getTrainer(),
                powerTraining.getClient(),
                powerTraining.getWorkingWeight()

        );
    }

    @Override
    public PowerTraining getById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }

    @Override
    public List<PowerTraining> get() {
        throw new NotImplementetExc("Method not implemented get");
    }

    @Override
    public PowerTraining update(PowerTraining powerTraining) {
        return new PowerTraining(
                powerTraining.getEquipment(),
                powerTraining.getName(),
                powerTraining.getTrainer(),
                powerTraining.getClient(),
                powerTraining.getWorkingWeight()

        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementetExc("Method not implemented deleteById");
    }
}
