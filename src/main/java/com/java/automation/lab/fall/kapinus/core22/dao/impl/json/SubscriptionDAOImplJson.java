package json;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Subscription;
import com.java.automation.lab.fall.kapinus.core22.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class SubscriptionDAOImplJson implements DAO<Subscription> {
    public Subscription create(Subscription o) {
        try {
            new JsonIO<>(Subscription.class).write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public Subscription getById(Long id) {
        try {
            return new JsonIO<>(Subscription.class).read(String.format(IOConstant.JSON_OBJ_PATH, Subscription.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
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
