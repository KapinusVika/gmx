package java.automation.lab.fall.kapinus.core22.dao.impl.clas;

import java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.NutritionProgram;
import java.automation.lab.fall.kapinus.core22.io.ObjectIO;
import java.util.List;

public class NutritionProgramDAOImplClas implements DAO<NutritionProgram> {

    @Override
    public NutritionProgram create(NutritionProgram o) {
        new ObjectIO<NutritionProgram>().write(o, IOConstant.RQ_PATH);
        return o;
    }

    @Override
    public NutritionProgram getById(Long id) {
        return new ObjectIO<NutritionProgram>().read(IOConstant.RQ_PATH);
    }

    @Override
    public List<NutritionProgram> get() {
        return null;
    }

    @Override
    public NutritionProgram update(NutritionProgram o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}