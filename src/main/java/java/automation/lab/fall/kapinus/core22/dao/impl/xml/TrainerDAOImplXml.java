package java.automation.lab.fall.kapinus.core22.dao.impl.xml;

import javax.xml.bind.JAXBException;
import java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.Trainer;
import java.automation.lab.fall.kapinus.core22.io.XMLIO;
import java.util.List;

public class TrainerDAOImplXml implements DAO<Trainer> {
    @Override
    public Trainer create(Trainer o) {
        try {
            new XMLIO<>(Trainer.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public Trainer getById(Long id) {
        return null;
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
