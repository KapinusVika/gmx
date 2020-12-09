package com.java.automation.lab.fall.kapinus.core22.dao.impl.mock;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Adress;
import com.java.automation.lab.fall.kapinus.core22.exceptions.NotImplementetExc;

import java.util.List;

public class AdressDAOImpl implements DAO<Adress> {
    private static AdressDAOImpl instance;

    public static synchronized AdressDAOImpl getInstance() {
        if(instance == null){
            instance = new AdressDAOImpl();
        }
        return instance;
    }

    @Override
    public Adress create(Adress adress) {
        return new Adress(
                adress.getCity(),
                adress.getStreet(),
                adress.getBuild(),
                adress.getApartment()
        );
    }

    @Override
    public Adress getById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }

    @Override
    public List<Adress> get() {
        throw new NotImplementetExc("Method not implemented get");
    }

    @Override
    public Adress update(Adress adress) {
        return new Adress(
                adress.getCity(),
                adress.getStreet(),
                adress.getBuild(),
                adress.getApartment()
        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementetExc("Method not implemented deleteById");
    }
}
