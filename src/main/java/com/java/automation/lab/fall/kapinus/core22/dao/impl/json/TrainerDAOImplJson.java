package json;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Trainer;
import com.java.automation.lab.fall.kapinus.core22.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class TrainerDAOImplJson implements DAO<Trainer> {
    public Trainer create(Trainer o) {
        try {
            new JsonIO<>(Trainer.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public Trainer getById(Long id) {
        try {
            return new JsonIO<>(Trainer.class).read(String.format(IOConstant.JSON_OBJ_PATH, Trainer.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Trainer> get() {
        return null;
    }

    @Override
    public Trainer update(Trainer o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
