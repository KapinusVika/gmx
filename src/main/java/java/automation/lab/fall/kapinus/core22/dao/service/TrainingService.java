package java.automation.lab.fall.kapinus.core22.dao.service;

import java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.Training;
import java.util.List;

public class TrainingService extends BaseService{

    private static final DAO<Training> TRAINING_DAO =
            TRAINING_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static Training createTraining(Training training){
        return TRAINING_DAO.create(training);
    }

    public static Training getTrainingById(Long id){
        return TRAINING_DAO.getById(id);
    }

    public static List<Training> get(){
        return TRAINING_DAO.get();
    }

    public static Training update(Training training){
        return TRAINING_DAO.update(training);
    }

    public static Long deleteById(Long id){
        return TRAINING_DAO.deleteById(id);
    }
}
