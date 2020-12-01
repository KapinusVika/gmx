package java.automation.lab.fall.kapinus.core22.dao.impl.clas;


import java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.CardioEquipment;
import java.automation.lab.fall.kapinus.core22.io.ObjectIO;
import java.util.List;

public class CardioEquipmentDAOImplClas implements DAO<CardioEquipment> {

    @Override
    public CardioEquipment create(CardioEquipment o) {
        new ObjectIO<CardioEquipment>().write(o, IOConstant.RQ_PATH);
        return o;
    }

    @Override
    public CardioEquipment getById(Long id) {
        return new ObjectIO<CardioEquipment>().read(IOConstant.RQ_PATH);

    }

    @Override
    public List<CardioEquipment> get() {
        return null;
    }

    @Override
    public CardioEquipment update(CardioEquipment o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
