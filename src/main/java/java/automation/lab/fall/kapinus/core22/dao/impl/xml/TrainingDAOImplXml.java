package java.automation.lab.fall.kapinus.core22.dao.impl.xml;

import javax.xml.bind.JAXBException;
import java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.CardioEquipment;
import java.automation.lab.fall.kapinus.core22.domain.Training;
import java.automation.lab.fall.kapinus.core22.io.XMLIO;
import java.util.List;

public class TrainingDAOImplXml implements DAO<Training> {
    @Override
    public Training create(Training o) {
        try {
            new XMLIO<>(Training.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public Training getById(Long id) {
        return null;
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
