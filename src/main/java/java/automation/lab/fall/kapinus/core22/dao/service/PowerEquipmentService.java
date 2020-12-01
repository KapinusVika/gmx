package java.automation.lab.fall.kapinus.core22.dao.service;

import java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.PowerEquipment;
import java.util.List;

public class PowerEquipmentService extends BaseService {

    private static final DAO<PowerEquipment> POWER_EQUIPMENT_DAO =
            POWER_EQUIPMENT_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static PowerEquipment createPowerEquipment(PowerEquipment powerEquipment){
        return POWER_EQUIPMENT_DAO.create(powerEquipment);
    }

    public static PowerEquipment getPowerEquipmentById(Long id){
        return POWER_EQUIPMENT_DAO.getById(id);
    }

    public static List<PowerEquipment> get(){
        return POWER_EQUIPMENT_DAO.get();
    }

    public static PowerEquipment update(PowerEquipment powerEquipment){
        return POWER_EQUIPMENT_DAO.update(powerEquipment);
    }

    public  static Long deleteById(Long id){
        return POWER_EQUIPMENT_DAO.deleteById(id);
    }
}
