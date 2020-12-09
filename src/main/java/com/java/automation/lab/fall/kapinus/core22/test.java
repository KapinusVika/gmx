package com.java.automation.lab.fall.kapinus.core22;

import com.java.automation.lab.fall.kapinus.core22.domain.*;
import com.java.automation.lab.fall.kapinus.core22.exceptions.*;
import com.java.automation.lab.fall.kapinus.core22.service.AdressService;
import org.apache.log4j.Logger;
import org.junit.Test;

public class test {

    private static final Logger LOGGER = Logger.getLogger(test.class);


    @Test
    public void testAdressCreate() throws UnableToReadException, AgeClientException, InvalidDiscountException,
            AgeTrainerException, InvalidScheduleException, InvalidCaloriesException {
        Adress v = new Adress("Minsk", "Marksa", 4, 5);
        new AdressService().createAdress(v);
    }


    @Test()
    public void testAdressDeleteById() {
        new AdressService().deleteById(2l);
    }



}




