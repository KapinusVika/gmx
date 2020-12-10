package com.java.automation.lab.fall.kapinus.core22;

import com.java.automation.lab.fall.kapinus.core22.domain.*;
import com.java.automation.lab.fall.kapinus.core22.exceptions.*;
import com.java.automation.lab.fall.kapinus.core22.service.AdressService;
import com.java.automation.lab.fall.kapinus.core22.service.CardioEquipmentService;
import com.java.automation.lab.fall.kapinus.core22.service.ContactService;
import com.java.automation.lab.fall.kapinus.core22.service.DateRangeService;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.net.URL;

public class test {

    private static final Logger LOGGER = Logger.getLogger(test.class);


    @Test
    public void testAdressCreate() throws UnableToReadException, AgeClientException, InvalidDiscountException,
            AgeTrainerException, InvalidScheduleException, InvalidCaloriesException {
        Adress v = new Adress("Minsk", "Lopatina", 2, 123);
        new AdressService().createAdress(v);
    }


    @Test()
    public void testAdressDeleteById() {
        new AdressService().deleteById(2l);
    }



    @Test
    public void testContactCreate() throws UnableToReadException, AgeClientException, InvalidDiscountException,
            AgeTrainerException, InvalidScheduleException, InvalidCaloriesException {

        Contact rrr = new Contact("2342123", "34423r");
        new ContactService().createContact(rrr);
    }

    @Test
    public void testCardioEquipmentCreate() throws UnableToReadException, AgeClientException, InvalidDiscountException,
            AgeTrainerException, InvalidScheduleException, InvalidCaloriesException {

        CardioEquipment cec = new CardioEquipment("nsnd", 1990, 343.5);
        new CardioEquipmentService().createCardioEquipment(cec);
    }



}



