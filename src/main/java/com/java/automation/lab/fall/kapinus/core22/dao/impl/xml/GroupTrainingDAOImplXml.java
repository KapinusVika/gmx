package com.java.automation.lab.fall.kapinus.core22.dao.impl.xml;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;

import javax.xml.bind.JAXBException;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.GroupTraining;
import com.java.automation.lab.fall.kapinus.core22.io.XMLIO;

import java.util.List;

public class GroupTrainingDAOImplXml implements DAO<GroupTraining> {
    @Override
    public GroupTraining create(GroupTraining o) {
        try {
            new XMLIO<>(GroupTraining.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public GroupTraining getById(Long id) {
        return null;
    }

    @Override
    public List<GroupTraining> get() {
        return null;
    }


    @Override
    public GroupTraining update(GroupTraining o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
