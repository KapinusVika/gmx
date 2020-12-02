package json;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Training;
import com.java.automation.lab.fall.kapinus.core22.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class TrainingDAOImplJson implements DAO<Training> {

    public Training create(Training o) {
    try {
        new JsonIO<>(Training.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
    } catch (IOException e) {
        e.printStackTrace();
        return null;
    }
    return o;
}

    @Override
    public Training getById(Long id) {
        try {
            return new JsonIO<>(Training.class).read(String.format(IOConstant.JSON_OBJ_PATH, Training.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Training> get() {
        return null;
    }

    @Override
    public Training update(Training o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
