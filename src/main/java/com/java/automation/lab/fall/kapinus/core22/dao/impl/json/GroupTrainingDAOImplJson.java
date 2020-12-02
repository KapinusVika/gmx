package json;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.GroupTraining;
import com.java.automation.lab.fall.kapinus.core22.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class GroupTrainingDAOImplJson implements DAO<GroupTraining> {
    public GroupTraining create(GroupTraining o) {
        try {
            new JsonIO<>(GroupTraining.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public GroupTraining getById(Long id) {
        try {
            return new JsonIO<>(GroupTraining.class)
                    .read(String.format(IOConstant.JSON_OBJ_PATH, GroupTraining.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
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
