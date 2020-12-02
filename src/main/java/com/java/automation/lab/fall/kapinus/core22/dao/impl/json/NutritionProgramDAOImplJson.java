package json;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.NutritionProgram;
import com.java.automation.lab.fall.kapinus.core22.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class NutritionProgramDAOImplJson implements DAO<NutritionProgram> {
    public NutritionProgram create(NutritionProgram o) {
        try {
            new JsonIO<>(NutritionProgram.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public NutritionProgram getById(Long id) {
        try {
            return new JsonIO<>(NutritionProgram.class).read(String.format(IOConstant.JSON_OBJ_PATH, NutritionProgram.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
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
