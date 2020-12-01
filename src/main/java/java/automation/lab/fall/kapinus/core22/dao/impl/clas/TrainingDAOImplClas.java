package java.automation.lab.fall.kapinus.core22.dao.impl.clas;

import java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.Training;
import java.automation.lab.fall.kapinus.core22.io.ObjectIO;
import java.util.List;

public class TrainingDAOImplClas implements DAO<Training> {

    @Override
    public  Training create( Training o) {
        new ObjectIO<Training>().write(o, IOConstant.RQ_PATH);
        return o;
    }

    @Override
    public  Training getById(Long id) {
        return new ObjectIO< Training>().read(IOConstant.RQ_PATH);
    }

    @Override
    public List< Training> get() {
        return null;
    }

    @Override
    public  Training update( Training o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}