package java.automation.lab.fall.kapinus.core22.dao.daoModel;

import java.automation.lab.fall.kapinus.core22.exceptions.*;
import java.util.List;

public interface DAO <T>{
        T create(T o) throws InvalidDiscountException;
        T getById(Long id);
        List<T> get();
        T update(T o) throws InvalidDiscountException;
        Long deleteById(Long id);
    }
