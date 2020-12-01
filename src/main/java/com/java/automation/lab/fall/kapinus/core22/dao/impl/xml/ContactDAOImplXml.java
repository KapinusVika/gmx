package com.java.automation.lab.fall.kapinus.core22.dao.impl.xml;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;

import javax.xml.bind.JAXBException;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Contact;
import com.java.automation.lab.fall.kapinus.core22.io.XMLIO;

import java.util.List;

public class ContactDAOImplXml implements DAO<Contact> {
    @Override
    public Contact create(Contact o) {
        try {
            new XMLIO<>(Contact.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public Contact getById(Long id) {
        return null;
    }

    @Override
    public List<Contact> get() {
        return null;
    }


    @Override
    public Contact update(Contact o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
