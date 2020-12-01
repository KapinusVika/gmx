package java.automation.lab.fall.kapinus.core22.dao.impl.mock;

import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.Trainer;
import java.automation.lab.fall.kapinus.core22.exceptions.NotImplementetExc;
import java.util.List;

public class TrainerDAOImpl implements DAO<Trainer> {

    private static TrainerDAOImpl instance;

    public static synchronized TrainerDAOImpl getInstance() {
        if(instance == null){
            instance = new TrainerDAOImpl();
        }
        return instance;
    }

    public TrainerDAOImpl(){

    }

    @Override
    public Trainer create(Trainer trainer) {
        return new Trainer(
                trainer.getName(),
                trainer.getAge(),
                trainer.getTrainerSpecialization(),
                trainer.getSchedule());
    }

    @Override
    public Trainer getById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }

    @Override
    public List<Trainer> get() {
        throw new NotImplementetExc("Method not implemented get");
    }

    @Override
    public Trainer update(Trainer trainer) {
        return new Trainer(
                trainer.getName(),
                trainer.getAge(),
                trainer.getTrainerSpecialization(),
                trainer.getSchedule());
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }
}
