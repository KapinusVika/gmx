package com.java.automation.lab.fall.kapinus.core22.dao.impl.xml;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.CardioTraining;
import com.java.automation.lab.fall.kapinus.core22.io.XMLIO;

import javax.xml.bind.JAXBException;
import java.util.List;

public class CardioTrainingDAOImplXml implements DAO<CardioTraining> {
    public CardioTraining create(CardioTraining o) {
        try {
            new XMLIO<>(CardioTraining.class)
                    .write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public CardioTraining getById(Long id) {
        return null;
    }

    @Override
    public List<CardioTraining> get() {
        return null;
    }

    @Override
    public CardioTraining update(CardioTraining o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
