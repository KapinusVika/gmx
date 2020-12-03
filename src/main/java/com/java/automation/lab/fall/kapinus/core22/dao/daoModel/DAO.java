package com.java.automation.lab.fall.kapinus.core22.dao.daoModel;

import com.java.automation.lab.fall.kapinus.core22.exceptions.*;

import java.util.List;

public interface DAO <T>{
        T create(T o) throws AgeTrainerException, AgeClientException,
                InvalidCaloriesException, InvalidDiscountException, InvalidScheduleException;
        T getById(Long id);
        List<T> get();
        T update(T o) throws AgeTrainerException, AgeClientException,
                InvalidCaloriesException, InvalidDiscountException, InvalidScheduleException;
        Long deleteById(Long id);
    }
