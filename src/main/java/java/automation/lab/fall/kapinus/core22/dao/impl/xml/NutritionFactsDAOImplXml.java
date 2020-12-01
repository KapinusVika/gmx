package java.automation.lab.fall.kapinus.core22.dao.impl.xml;

import javax.xml.bind.JAXBException;
import java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.NutritionFacts;
import java.automation.lab.fall.kapinus.core22.io.XMLIO;
import java.util.List;

public class NutritionFactsDAOImplXml implements DAO<NutritionFacts> {
    @Override
    public NutritionFacts create(NutritionFacts o) {
        try {
            new XMLIO<>(NutritionFacts.class).write(o, String.format(IOConstant.XML_OBJ_PATH, o.getClass().getCanonicalName()));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    @Override
    public NutritionFacts getById(Long id) {
        return null;
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
