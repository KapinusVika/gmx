package json;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.PowerEquipment;
import com.java.automation.lab.fall.kapinus.core22.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class PowerEquipmentDAOImplJson implements DAO<PowerEquipment> {
    public PowerEquipment create(PowerEquipment o) {
        try {
            new JsonIO<>(PowerEquipment.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public PowerEquipment getById(Long id) {
        try {
            return new JsonIO<>(PowerEquipment.class).read(String.format(IOConstant.JSON_OBJ_PATH, PowerEquipment.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<PowerEquipment> get() {
        return null;
    }

    @Override
    public PowerEquipment update(PowerEquipment o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
