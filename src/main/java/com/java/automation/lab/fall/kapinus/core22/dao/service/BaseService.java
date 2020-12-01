package com.java.automation.lab.fall.kapinus.core22.dao.service;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.automation.lab.fall.kapinus.core22.dao.impl.clas.*;
import com.automation.lab.fall.kapinus.core22.dao.impl.mock.*;
import com.automation.lab.fall.kapinus.core22.dao.impl.xml.*;
import com.automation.lab.fall.kapinus.core22.domain.*;
import com.java.automation.lab.fall.kapinus.core22.io.PropertyReader;
import com.java.automation.lab.fall.kapinus.core22.dao.impl.clas.*;
import com.java.automation.lab.fall.kapinus.core22.dao.impl.mock.*;
import com.java.automation.lab.fall.kapinus.core22.dao.impl.xml.*;
import com.java.automation.lab.fall.kapinus.core22.domain.*;

import java.automation.lab.fall.kapinus.core22.dao.impl.clas.*;
import java.automation.lab.fall.kapinus.core22.dao.impl.mock.*;
import java.automation.lab.fall.kapinus.core22.dao.impl.xml.*;
import java.automation.lab.fall.kapinus.core22.domain.*;
import java.util.Map;

public class BaseService {

    protected static final PropertyReader PROPS = PropertyReader.getInstance();

    protected static final Map<String, DAO<Adress>> ADRESS_DAOS = Map.of(
            "MOCK", new AdressDAOImpl(),
            "OBJ", new AdressDAOImplClas(),
            "XML", new AdressDAOImplXml()
    );

    protected static final Map<String, DAO<CardioEquipment>> CARDIO_EQUIPMENT_DAOS = Map.of(
            "MOCK", new CardioEquipmentDAOImpl(),
            "OBJ", new CardioEquipmentDAOImplClas(),
            "XML", new CardioEquipmentDAOImplXml()
    );

    protected static final Map<String, DAO<Client>> CLIENT_DAOS = Map.of(
            "MOCK", new ClientDAOImpl(),
            "OBJ", new ClientDAOImplClas(),
            "XML", new ClientDAOImplXml()
    );

    protected static final Map<String, DAO<Contact>> CONTACT_DAOS = Map.of(
            "MOCK", new ContactDAOImpl(),
            "OBJ", new ContactDAOImplClas(),
            "XML", new ContactDAOImplXml()
    );

    protected static final Map<String, DAO<DescriptionEquipment>> DESCRIPTION_EQUIPMENT_DAOS = Map.of(
            "MOCK", new DescriptionEquipmentDAOImpl(),
            "OBJ", new DescriptionEquipmentDAOImplClas(),
            "XML", new DescriptionEquipmentDAOImplXml()
    );

    protected static final Map<String, DAO<GroupTraining>> GROUP_TRAINING_DAOS = Map.of(
            "MOCK", new GroupTrainingDAOImpl(),
            "OBJ", new GroupTrainingDAOImplClas(),
            "XML", new GroupTrainingDAOImplXml()

    );

    protected static final Map<String, DAO<NutritionFacts>> NUTRITION_FACTS_DAOS = Map.of(
            "MOCK", new NutritionFactsDAOImpl(),
            "OBJ", new NutritionFactsDAOImplClas(),
            "XML", new NutritionFactsDAOImplXml()
    );

    protected static final Map<String, DAO<NutritionProgram>> NUTRITION_PROGRAM_DAOS = Map.of(
            "MOCK", new NutritionProgramDAOImpl(),
            "OBJ", new NutritionProgramDAOImplClas(),
            "XML", new NutritionProgramDAOImplXml()
    );

    protected static final Map<String, DAO<PowerEquipment>> POWER_EQUIPMENT_DAOS = Map.of(
            "MOCK", new PowerEquipmentDAOImpl(),
            "OBJ", new PowerEquipmentDAOImplClas(),
            "XML", new PowerEquipmentDAOImplXml()
    );

    protected static final Map<String, DAO<PricePlan>> PRICE_PLAN_DAOS = Map.of(
            "MOCK", new PricePlanDAOImpl(),
            "OBJ", new PricePlanDAOImplClas(),
            "XML", new PricePlanDAOImplXml()
    );

    protected static final Map<String, DAO<Subscription>> SUBSCRIPTION_DAOS = Map.of(
            "MOCK", new SubscriptionDAOImpl(),
            "OBJ", new SubscriptionDAOImplClas(),
            "XML", new SubscriptionDAOImplXml()
    );

    protected static final Map<String, DAO<Trainer>> TRAINER_DAOS = Map.of(
            "MOCK", new TrainerDAOImpl(),
            "OBJ", new TrainerDAOImplClas(),
            "XML", new TrainerDAOImplXml()
    );

    protected static final Map<String, DAO<TrainingProgram>> TRAINING_PROGRAM_DAOS = Map.of(
            "MOCK", new TrainingProgramDAOImpl(),
            "OBJ", new TrainingProgramDAOImplClas(),
            "XML", new TrainingProgramDAOImplXml()
    );

    protected static final Map<String, DAO<Training>> TRAINING_DAOS = Map.of(
            "MOCK", new TrainingDAOImpl(),
            "OBJ", new TrainingDAOImplClas(),
            "XML", new TrainingDAOImplXml()
    );

}
