package java.automation.lab.fall.kapinus.core22.dao.impl.xml;

import javax.xml.bind.JAXBException;
import java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.PowerEquipment;
import java.automation.lab.fall.kapinus.core22.io.XMLIO;
import java.util.List;

public class PowerEquipmentDAOImplXml implements DAO<PowerEquipment> {
    @Override
    public PowerEquipment create(PowerEquipment o) {
        try {
            new XMLIO<>(PowerEquipment.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public PowerEquipment getById(Long id) {
        return null;
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
