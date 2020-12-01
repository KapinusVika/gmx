package com.java.automation.lab.fall.kapinus.core22.dao.service;


import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Adress;

import java.util.List;

public class AdressService extends BaseService{

    private static final DAO<Adress> ADRESS_DAO = ADRESS_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static Adress createAdress(Adress adress) {
        return ADRESS_DAO.create(adress);
    }

    public static Adress getAdressById(Long id){
        return ADRESS_DAO.getById(id);
    }

    public static List<Adress> get(){
        return ADRESS_DAO.get();
    }

    public static Adress update(Adress adress) {
        return ADRESS_DAO.update(adress);
    }

    public  static Long deleteById(Long id){
        return ADRESS_DAO.deleteById(id);
    }
}
