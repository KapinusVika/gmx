package json;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Contact;
import com.java.automation.lab.fall.kapinus.core22.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class ContactDAOImplJson implements DAO<Contact> {
    public Contact create(Contact o) {
        try {
            new JsonIO<>(Contact.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public Contact getById(Long id) {
        try {
            return new JsonIO<>(Contact.class).read(String.format(IOConstant.JSON_OBJ_PATH, Contact.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
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
