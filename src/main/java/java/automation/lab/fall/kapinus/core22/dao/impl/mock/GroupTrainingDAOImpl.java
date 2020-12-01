package java.automation.lab.fall.kapinus.core22.dao.impl.mock;

import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.GroupTraining;
import java.automation.lab.fall.kapinus.core22.exceptions.NotImplementetExc;
import java.util.List;

public class GroupTrainingDAOImpl implements DAO<GroupTraining> {

    private static GroupTrainingDAOImpl instance;

    public static synchronized GroupTrainingDAOImpl getInstance() {
        if(instance == null){
            instance = new GroupTrainingDAOImpl();
        }
        return instance;
    }

    @Override
    public GroupTraining create(GroupTraining groupTraining) {
        return new GroupTraining(
                groupTraining.getName(),
                groupTraining.getTrainer(),
                groupTraining.getClients(),
                groupTraining.getDuration()
        );
    }

    @Override
    public GroupTraining getById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }

    @Override
    public List<GroupTraining> get() {
        throw new NotImplementetExc("Method not implemented get");
    }

    @Override
    public GroupTraining update(GroupTraining groupTraining) {
        return new GroupTraining(
                groupTraining.getName(),
                groupTraining.getTrainer(),
                groupTraining.getClients(),
                groupTraining.getDuration()
        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementetExc("Method not implemented deleteById");
    }
}
