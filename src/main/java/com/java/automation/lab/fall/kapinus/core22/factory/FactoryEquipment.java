package com.java.automation.lab.fall.kapinus.core22.factory;


import com.java.automation.lab.fall.kapinus.core22.domain.CardioEquipment;
import com.java.automation.lab.fall.kapinus.core22.domain.DescriptionEquipment;
import com.java.automation.lab.fall.kapinus.core22.domain.Equipment;
import com.java.automation.lab.fall.kapinus.core22.domain.PowerEquipment;
import com.java.automation.lab.fall.kapinus.core22.enums.EquipmentsType;

import java.util.Map;

public class FactoryEquipment {
    private static final Map<EquipmentsType, Factory<? extends Equipment>> types = Map.of(
            EquipmentsType.CARDIO, new Factory(CardioEquipment.class),
            EquipmentsType.POWER, new Factory(PowerEquipment.class));

    public static Equipment createEquipment(EquipmentsType equipmentsType, DescriptionEquipment descriptionEquipment){
        return types.get(equipmentsType).getInstance().setDescriptionEquipment(descriptionEquipment);

    }
}
