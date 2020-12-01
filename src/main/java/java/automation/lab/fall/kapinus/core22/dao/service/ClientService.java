package java.automation.lab.fall.kapinus.core22.dao.service;

import java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.Client;
import java.util.List;

public class ClientService extends BaseService {

    private static final DAO<Client> CLIENT_DAO =
            CLIENT_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));


    public static Client createClient(Client client) {
        return CLIENT_DAO.create(client);
    }

    public static Client getClientById(Long id){
        return CLIENT_DAO.getById(id);
    }

    public static List<Client> get(){
        return CLIENT_DAO.get();
    }

    public static Client update(Client client){
        return CLIENT_DAO.update(client);
    }

    public  static Long deleteById(Long id){
        return CLIENT_DAO.deleteById(id);
    }

}
