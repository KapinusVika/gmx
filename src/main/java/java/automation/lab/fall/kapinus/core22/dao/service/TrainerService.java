package java.automation.lab.fall.kapinus.core22.dao.service;

import java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.Trainer;
import java.util.List;

public class TrainerService extends BaseService{

    private static final DAO<Trainer> TRAINER_DAO =
            TRAINER_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static Trainer createTrainer(Trainer trainer) {
        return TRAINER_DAO.create(trainer);
    }

    public static Trainer getTrainerById(Long id){
        return TRAINER_DAO.getById(id);
    }

    public static List<Trainer> get(){
        return TRAINER_DAO.get();
    }

    public static Trainer update(Trainer trainer){
        return TRAINER_DAO.update(trainer);
    }

    public  static Long deleteById(Long id){
        return TRAINER_DAO.deleteById(id);
    }
}
