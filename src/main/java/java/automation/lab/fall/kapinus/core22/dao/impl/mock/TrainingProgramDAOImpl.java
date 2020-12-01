package java.automation.lab.fall.kapinus.core22.dao.impl.mock;

import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.TrainingProgram;
import java.automation.lab.fall.kapinus.core22.exceptions.NotImplementetExc;
import java.util.List;

public class TrainingProgramDAOImpl implements DAO<TrainingProgram> {

    private static TrainingProgramDAOImpl instance;

    public static synchronized TrainingProgramDAOImpl getInstance() {
        if(instance == null){
            instance = new TrainingProgramDAOImpl();
        }
        return instance;
    }

    @Override
    public TrainingProgram create(TrainingProgram trainingProgram) {
        return new TrainingProgram(
                trainingProgram.getNameTraining(),
                trainingProgram.getCardioTraining(),
                trainingProgram.getPowerTraining());
    }

    @Override
    public TrainingProgram getById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }

    @Override
    public List<TrainingProgram> get() {
        throw new NotImplementetExc("Method not implemented get");
    }

    @Override
    public TrainingProgram update(TrainingProgram trainingProgram) {
        return new TrainingProgram(
                trainingProgram.getNameTraining(),
                trainingProgram.getCardioTraining(),
                trainingProgram.getPowerTraining());
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementetExc("Method not implemented deleteById");
    }
}
