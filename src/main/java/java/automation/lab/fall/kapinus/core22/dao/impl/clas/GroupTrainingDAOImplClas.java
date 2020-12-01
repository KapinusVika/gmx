package java.automation.lab.fall.kapinus.core22.dao.impl.clas;

import java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.GroupTraining;
import java.automation.lab.fall.kapinus.core22.io.ObjectIO;
import java.util.List;

public class GroupTrainingDAOImplClas implements DAO<GroupTraining> {

    @Override
    public GroupTraining create(GroupTraining o) {
        new ObjectIO<GroupTraining>().write(o, IOConstant.RQ_PATH);
        return o;
    }

    @Override
    public GroupTraining getById(Long id) {
        return new ObjectIO<GroupTraining>().read(IOConstant.RQ_PATH);
    }

    @Override
    public List<GroupTraining> get() {
        return null;
    }

    @Override
    public GroupTraining update(GroupTraining o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}