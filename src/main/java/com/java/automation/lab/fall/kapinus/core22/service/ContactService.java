package com.java.automation.lab.fall.kapinus.core22.service;

import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Contact;
import com.java.automation.lab.fall.kapinus.core22.exceptions.*;

import java.util.List;

public class ContactService extends BaseService{

    private static final DAO<Contact> CONTACT_DAO=
            CONTACT_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));


    public static Contact createContact(Contact contact) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        return CONTACT_DAO.create(contact);
    }

    public static Contact getContactById(Long id){
        return CONTACT_DAO.getById(id);
    }

    public static List<Contact> get(){
        return CONTACT_DAO.get();
    }

    public static Contact update(Contact contact) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        return CONTACT_DAO.update(contact);
    }

    public  static Long deleteById(Long id){
        return CONTACT_DAO.deleteById(id);
    }
}
