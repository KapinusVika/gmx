package com.java.automation.lab.fall.kapinus.core22.dao.impl.mock;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.CardioTraining;
import com.java.automation.lab.fall.kapinus.core22.exceptions.NotImplementetExc;

import java.util.List;

public class CardioTrainingDAOImpl implements DAO<CardioTraining> {
    private static CardioTrainingDAOImpl instance;

    public static synchronized CardioTrainingDAOImpl getInstance() {
        if(instance == null){
            instance = new CardioTrainingDAOImpl();
        }
        return instance;
    }

    @Override
    public CardioTraining create(CardioTraining cardioTraining) {
        return new CardioTraining(
                cardioTraining.getName(),
                cardioTraining.getTrainer(),
                cardioTraining.getClient(),
                cardioTraining.getEquipment(),
                cardioTraining.getDuration()

        );
    }

    @Override
    public CardioTraining getById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }

    @Override
    public List<CardioTraining> get() {
        throw new NotImplementetExc("Method not implemented get");
    }

    @Override
    public CardioTraining update(CardioTraining cardioTraining) {
        return new CardioTraining(
                cardioTraining.getName(),
                cardioTraining.getTrainer(),
                cardioTraining.getClient(),
                cardioTraining.getEquipment(),
                cardioTraining.getDuration()

        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementetExc("Method not implemented deleteById");
    }
}
