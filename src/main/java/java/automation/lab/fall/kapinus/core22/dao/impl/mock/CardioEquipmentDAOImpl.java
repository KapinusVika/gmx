package java.automation.lab.fall.kapinus.core22.dao.impl.mock;

import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.domain.CardioEquipment;
import java.automation.lab.fall.kapinus.core22.exceptions.NotImplementetExc;
import java.util.List;

public class CardioEquipmentDAOImpl implements DAO<CardioEquipment> {

    private static CardioEquipmentDAOImpl instance;

    public static synchronized CardioEquipmentDAOImpl getInstance() {
        if(instance == null){
            instance = new CardioEquipmentDAOImpl();
        }
        return instance;
    }

    @Override
    public CardioEquipment create(CardioEquipment o) {
        return new CardioEquipment(
                o.getDescriptionEquipment(),
                o.getMaxWeight()
        );
    }

    @Override
    public CardioEquipment getById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }

    @Override
    public List<CardioEquipment> get() {
        throw new NotImplementetExc("Method not implemented get");
    }

    @Override
    public CardioEquipment update(CardioEquipment o) {
        return new CardioEquipment(
                o.getDescriptionEquipment(),
                o.getMaxWeight()
        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementetExc("Method not implemented deleteById");
    }
}
