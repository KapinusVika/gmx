package java.automation.lab.fall.kapinus.core22.dao.impl.xml;

import javax.xml.bind.JAXBException;
import java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.Client;
import java.automation.lab.fall.kapinus.core22.io.XMLIO;
import java.util.List;

public class ClientDAOImplXml implements DAO<Client> {
    @Override
    public Client create(Client o) {
        try {
            new XMLIO<>(Client.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public Client getById(Long id) {
        return null;
    }

    @Override
    public List<Client> get() {
        return null;
    }


    @Override
    public Client update(Client o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
