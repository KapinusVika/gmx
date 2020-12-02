package json;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.TrainingProgram;
import com.java.automation.lab.fall.kapinus.core22.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class TrainingProgramDAOImplJson implements DAO<TrainingProgram> {
    public TrainingProgram create(TrainingProgram o) {
        try {
            new JsonIO<>(TrainingProgram.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public TrainingProgram getById(Long id) {
        try {
            return new JsonIO<>(TrainingProgram.class).read(String.format(IOConstant.JSON_OBJ_PATH, TrainingProgram.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<TrainingProgram> get() {
        return null;
    }

    @Override
    public TrainingProgram update(TrainingProgram o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
