package com.java.automation.lab.fall.kapinus.core22.dao.impl.json;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Adress;
import com.java.automation.lab.fall.kapinus.core22.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class AdressDAOImplJson implements DAO<Adress> {
    public Adress create(Adress o) {
        try {
            new JsonIO<>(Adress.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public Adress getById(Long id) {
        try {
            return new JsonIO<>(Adress.class).read(String.format(IOConstant.JSON_OBJ_PATH, Adress.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Adress> get() {
        return null;
    }

    @Override
    public Adress update(Adress o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
