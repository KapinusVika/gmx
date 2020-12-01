package java.automation.lab.fall.kapinus.core22.dao.impl.mock;

import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.Client;
import java.automation.lab.fall.kapinus.core22.exceptions.AgeClientException;
import java.automation.lab.fall.kapinus.core22.exceptions.NotImplementetExc;
import java.util.List;

public class ClientDAOImpl implements DAO<Client> {

    private static ClientDAOImpl instance;

    public static synchronized ClientDAOImpl getInstance() {
        if(instance == null){
            instance = new ClientDAOImpl();
        }
        return instance;
    }

    public ClientDAOImpl(){

    }

    @Override
    public Client create(Client client) throws AgeClientException {
        return new Client(
                client.getName(),
                client.getAge(),
                client.getAgeGroups(),
                client.getSubscription(),
                client.getNutritionProgram(),
                client.getTrainingProgram());
    }

    @Override
    public Client getById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }

    @Override
    public List<Client> get() {
        throw new NotImplementetExc("Method not implemented get");
    }

    @Override
    public Client update(Client client) throws AgeClientException {
        return new Client(
                client.getName(),
                client.getAge(),
                client.getAgeGroups(),
                client.getSubscription(),
                client.getNutritionProgram(),
                client.getTrainingProgram());
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }
}
