package com.java.automation.lab.fall.kapinus.core22.dao.impl.xml;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;

import javax.xml.bind.JAXBException;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.DescriptionEquipment;
import com.java.automation.lab.fall.kapinus.core22.io.XMLIO;

import java.util.List;

public class DescriptionEquipmentDAOImplXml implements DAO<DescriptionEquipment> {
    @Override
    public DescriptionEquipment create(DescriptionEquipment o) {
        try {
            new XMLIO<>(DescriptionEquipment.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public DescriptionEquipment getById(Long id) {
        return null;
    }

    @Override
    public List<DescriptionEquipment> get() {
        return null;
    }


    @Override
    public DescriptionEquipment update(DescriptionEquipment o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
