package java.automation.lab.fall.kapinus.core22.dao.impl.clas;


import java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.Contact;
import java.automation.lab.fall.kapinus.core22.io.ObjectIO;
import java.util.List;

public class ContactDAOImplClas implements DAO<Contact> {

    @Override
    public Contact create(Contact o) {
        new ObjectIO<Contact>().write(o, IOConstant.RQ_PATH);
        return o;
    }

    @Override
    public Contact getById(Long id) {
        return new ObjectIO<Contact>().read(IOConstant.RQ_PATH);
    }

    @Override
    public List<Contact> get() {
        return null;
    }

    @Override
    public Contact update(Contact o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
