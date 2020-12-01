package java.automation.lab.fall.kapinus.core22.dao.impl.xml;

import javax.xml.bind.JAXBException;
import java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.Subscription;
import java.automation.lab.fall.kapinus.core22.io.XMLIO;
import java.util.List;

public class SubscriptionDAOImplXml implements DAO<Subscription> {
    @Override
    public Subscription create(Subscription o) {
        try {
            new XMLIO<>(Subscription.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public Subscription getById(Long id) {
        return null;
    }

    @Override
    public List<Subscription> get() {
        return null;
    }


    @Override
    public Subscription update(Subscription o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
