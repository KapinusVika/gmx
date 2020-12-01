package com.java.automation.lab.fall.kapinus.core22.dao.impl.xml;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;

import javax.xml.bind.JAXBException;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.NutritionProgram;
import com.java.automation.lab.fall.kapinus.core22.io.XMLIO;

import java.util.List;

public class NutritionProgramDAOImplXml implements DAO<NutritionProgram> {
    @Override
    public NutritionProgram create(NutritionProgram o) {
        try {
            new XMLIO<>(NutritionProgram.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public NutritionProgram getById(Long id) {
        return null;
    }

    @Override
    public List<NutritionProgram> get() {
        return null;
    }


    @Override
    public NutritionProgram update(NutritionProgram o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }

}
