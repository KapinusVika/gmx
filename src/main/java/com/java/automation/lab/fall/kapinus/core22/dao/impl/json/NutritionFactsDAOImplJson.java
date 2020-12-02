package json;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.NutritionFacts;
import com.java.automation.lab.fall.kapinus.core22.io.JsonIO;

import java.io.IOException;
import java.util.List;

public class NutritionFactsDAOImplJson implements DAO<NutritionFacts> {
    public NutritionFacts create(NutritionFacts o) {
        try {
            new JsonIO<>(NutritionFacts.class)
                    .write(o, String.format(IOConstant.JSON_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public NutritionFacts getById(Long id) {
        try {
            return new JsonIO<>(NutritionFacts.class)
                    .read(String.format(IOConstant.JSON_OBJ_PATH, NutritionFacts.class.getCanonicalName()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<NutritionFacts> get() {
        return null;
    }

    @Override
    public NutritionFacts update(NutritionFacts o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
