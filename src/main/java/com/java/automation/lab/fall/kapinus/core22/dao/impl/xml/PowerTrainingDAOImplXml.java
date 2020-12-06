package com.java.automation.lab.fall.kapinus.core22.dao.impl.xml;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.PowerTraining;
import com.java.automation.lab.fall.kapinus.core22.io.XMLIO;

import javax.xml.bind.JAXBException;
import java.util.List;

public class PowerTrainingDAOImplXml implements DAO<PowerTraining> {
    public PowerTraining create(PowerTraining o) {
        try {
            new XMLIO<>(PowerTraining.class)
                    .write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public PowerTraining getById(Long id) {
        return null;
    }

    @Override
    public List<PowerTraining> get() {
        return null;
    }

    @Override
    public PowerTraining update(PowerTraining o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
