package java.automation.lab.fall.kapinus.core22.dao.service;

import java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.DescriptionEquipment;
import java.util.List;

public class DescriptionEquipmentService extends BaseService{

    private static final DAO<DescriptionEquipment> DESCRIPTION_EQUIPMENT_DAO=
            DESCRIPTION_EQUIPMENT_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static DescriptionEquipment createDescriptionEquipment(DescriptionEquipment descriptionEquipment){
        return DESCRIPTION_EQUIPMENT_DAO.create(descriptionEquipment);
    }

    public static DescriptionEquipment getDescriptionEquipmentsById(Long id){
        return DESCRIPTION_EQUIPMENT_DAO.getById(id);
    }

    public static List<DescriptionEquipment> get(){
        return DESCRIPTION_EQUIPMENT_DAO.get();
    }

    public static DescriptionEquipment update(DescriptionEquipment descriptionEquipment){
        return DESCRIPTION_EQUIPMENT_DAO.update(descriptionEquipment);
    }

    public  static Long deleteById(Long id){
        return DESCRIPTION_EQUIPMENT_DAO.deleteById(id);
    }
}
