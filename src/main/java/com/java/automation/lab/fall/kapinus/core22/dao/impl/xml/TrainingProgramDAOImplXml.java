package com.java.automation.lab.fall.kapinus.core22.dao.impl.xml;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;

import javax.xml.bind.JAXBException;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.TrainingProgram;
import com.java.automation.lab.fall.kapinus.core22.io.XMLIO;

import java.util.List;

public class TrainingProgramDAOImplXml implements DAO<TrainingProgram> {
    @Override
    public TrainingProgram create(TrainingProgram o) {
        try {
            new XMLIO<>(TrainingProgram.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public TrainingProgram getById(Long id) {
        return null;
    }

    @Override
    public List<TrainingProgram> get() {
        return null;
    }


    @Override
    public TrainingProgram update(TrainingProgram o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
