package com.java.automation.lab.fall.kapinus.core22.service;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.dao.impl.json.*;
import com.java.automation.lab.fall.kapinus.core22.io.PropertyReader;
import com.java.automation.lab.fall.kapinus.core22.dao.impl.clas.*;
import com.java.automation.lab.fall.kapinus.core22.dao.impl.mock.*;
import com.java.automation.lab.fall.kapinus.core22.dao.impl.xml.*;
import com.java.automation.lab.fall.kapinus.core22.domain.*;
import java.util.Map;

public class BaseService {

    protected static final PropertyReader PROPS = PropertyReader.getInstance();

    protected static final Map<String, DAO<Adress>> ADRESS_DAOS = Map.of(
            "MOCK", new AdressDAOImpl(),
            "OBJ", new AdressDAOImplClas(),
            "XML", new AdressDAOImplXml(),
            "Json", new AdressDAOImplJson()
    );

    protected static final Map<String, DAO<CardioEquipment>> CARDIO_EQUIPMENT_DAOS = Map.of(
            "MOCK", new CardioEquipmentDAOImpl(),
            "OBJ", new CardioEquipmentDAOImplClas(),
            "XML", new CardioEquipmentDAOImplXml(),
            "Json", new CardioEquipmentDAOImplJson()
    );

    protected static final Map<String, DAO<Client>> CLIENT_DAOS = Map.of(
            "MOCK", new ClientDAOImpl(),
            "OBJ", new ClientDAOImplClas(),
            "XML", new ClientDAOImplXml(),
            "Json", new ClientDAOImplJson()
    );

    protected static final Map<String, DAO<Contact>> CONTACT_DAOS = Map.of(
            "MOCK", new ContactDAOImpl(),
            "OBJ", new ContactDAOImplClas(),
            "XML", new ContactDAOImplXml(),
            "Json", new ContactDAOImplJson()
    );

    protected static final Map<String, DAO<DescriptionEquipment>> DESCRIPTION_EQUIPMENT_DAOS = Map.of(
            "MOCK", new DescriptionEquipmentDAOImpl(),
            "OBJ", new DescriptionEquipmentDAOImplClas(),
            "XML", new DescriptionEquipmentDAOImplXml(),
            "Json", new DescriptionEquipmentDAOImplJson()
    );

    protected static final Map<String, DAO<GroupTraining>> GROUP_TRAINING_DAOS = Map.of(
            "MOCK", new GroupTrainingDAOImpl(),
            "OBJ", new GroupTrainingDAOImplClas(),
            "XML", new GroupTrainingDAOImplXml(),
            "Json", new GroupTrainingDAOImplJson()

    );

    protected static final Map<String, DAO<NutritionFacts>> NUTRITION_FACTS_DAOS = Map.of(
            "MOCK", new NutritionFactsDAOImpl(),
            "OBJ", new NutritionFactsDAOImplClas(),
            "XML", new NutritionFactsDAOImplXml(),
            "Json", new NutritionFactsDAOImplJson()
    );

    protected static final Map<String, DAO<NutritionProgram>> NUTRITION_PROGRAM_DAOS = Map.of(
            "MOCK", new NutritionProgramDAOImpl(),
            "OBJ", new NutritionProgramDAOImplClas(),
            "XML", new NutritionProgramDAOImplXml(),
            "Json", new NutritionProgramDAOImplJson()
    );

    protected static final Map<String, DAO<PowerEquipment>> POWER_EQUIPMENT_DAOS = Map.of(
            "MOCK", new PowerEquipmentDAOImpl(),
            "OBJ", new PowerEquipmentDAOImplClas(),
            "XML", new PowerEquipmentDAOImplXml(),
            "Json", new PowerEquipmentDAOImplJson()
    );

    protected static final Map<String, DAO<PricePlan>> PRICE_PLAN_DAOS = Map.of(
            "MOCK", new PricePlanDAOImpl(),
            "OBJ", new PricePlanDAOImplClas(),
            "XML", new PricePlanDAOImplXml(),
            "Json", new PricePlanDAOImplJson()
    );

    protected static final Map<String, DAO<Subscription>> SUBSCRIPTION_DAOS = Map.of(
            "MOCK", new SubscriptionDAOImpl(),
            "OBJ", new SubscriptionDAOImplClas(),
            "XML", new SubscriptionDAOImplXml(),
            "Json", new SubscriptionDAOImplJson()
    );

    protected static final Map<String, DAO<Trainer>> TRAINER_DAOS = Map.of(
            "MOCK", new TrainerDAOImpl(),
            "OBJ", new TrainerDAOImplClas(),
            "XML", new TrainerDAOImplXml(),
            "Json", new TrainerDAOImplJson()
    );

    protected static final Map<String, DAO<TrainingProgram>> TRAINING_PROGRAM_DAOS = Map.of(
            "MOCK", new TrainingProgramDAOImpl(),
            "OBJ", new TrainingProgramDAOImplClas(),
            "XML", new TrainingProgramDAOImplXml(),
            "Json", new TrainingProgramDAOImplJson()
    );

    protected static final Map<String, DAO<Training>> TRAINING_DAOS = Map.of(
            "MOCK", new TrainingDAOImpl(),
            "OBJ", new TrainingDAOImplClas(),
            "XML", new TrainingDAOImplXml(),
            "Json", new TrainingDAOImplJson()
    );

}
