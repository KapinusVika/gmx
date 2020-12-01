package java.automation.lab.fall.kapinus.core22.dao.service;

import java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.GroupTraining;
import java.util.List;

public class GroupTrainingService extends BaseService {

    private static final DAO<GroupTraining> GROUP_TRAINING_DAO=
            GROUP_TRAINING_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));


    public static GroupTraining createGroupTraining(GroupTraining groupTraining){
        return GROUP_TRAINING_DAO.create(groupTraining);
    }

    public static GroupTraining getGroupTrainingById(Long id){
        return GROUP_TRAINING_DAO.getById(id);
    }

    public static List<GroupTraining> get(){
        return GROUP_TRAINING_DAO.get();
    }

    public static GroupTraining update(GroupTraining groupTraining){
        return GROUP_TRAINING_DAO.update(groupTraining);
    }

    public  static Long deleteById(Long id){
        return GROUP_TRAINING_DAO.deleteById(id);
    }
}
