package com.java.automation.lab.fall.kapinus.core22.dao.impl.json;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Client;
import com.java.automation.lab.fall.kapinus.core22.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class ClientDAOImplJson implements DAO<Client> {
    public Client create(Client o) {
        try {
            new JsonIO<>(Client.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public Client getById(Long id) {
        try {
            return new JsonIO<>(Client.class).read(String.format(IOConstant.JSON_OBJ_PATH, Client.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Client> get() {
        return null;
    }

    @Override
    public Client update(Client o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
