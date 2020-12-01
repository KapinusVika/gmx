package java.automation.lab.fall.kapinus.core22.dao.impl.xml;

import javax.xml.bind.JAXBException;
import java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.Adress;
import java.automation.lab.fall.kapinus.core22.io.XMLIO;

import java.util.List;

public class AdressDAOImplXml implements DAO<Adress> {
    @Override
    public Adress create(Adress o) {
        try {
            new XMLIO<>(Adress.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public Adress getById(Long id) {
        return null;
    }

    @Override
    public List<Adress> get() {
        return null;
    }

    @Override
    public Adress update(Adress o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}