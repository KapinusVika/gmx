package com.java.automation.lab.fall.kapinus.core22.service;

import com.java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Client;
import com.java.automation.lab.fall.kapinus.core22.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ClientService extends BaseService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientService.class);

    private static final DAO<Client> CLIENT_DAO =
            CLIENT_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));


    public static Client createClient(Client client) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to create {}", client);
        return CLIENT_DAO.create(client);
    }

    public static Client getClientById(Long id){
        LOGGER.info("Selecting client by Id " + id);
        return CLIENT_DAO.getById(id);
    }

    public static List<Client> get(){
        LOGGER.info("Selecting all clients");
        return CLIENT_DAO.get();
    }

    public static Client update(Client client) throws AgeClientException, InvalidDiscountException, InvalidCaloriesException, InvalidScheduleException, AgeTrainerException {
        LOGGER.info("Going to update {}", client);
        return CLIENT_DAO.update(client);
    }

    public  static Long deleteById(Long id){
        LOGGER.info("Deleting client by Id " + id);
        return CLIENT_DAO.deleteById(id);
    }

}
