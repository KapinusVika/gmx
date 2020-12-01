package com.java.automation.lab.fall.kapinus.core22.dao.impl.clas;

import com.java.automation.lab.fall.kapinus.core22.constant.IOConstant;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.io.ObjectIO;
import com.java.automation.lab.fall.kapinus.core22.domain.TrainingProgram;

import java.util.List;

public class TrainingProgramDAOImplClas implements DAO<TrainingProgram> {

    @Override
    public TrainingProgram create(TrainingProgram o) {
        new ObjectIO<TrainingProgram>().write(o, IOConstant.RQ_PATH);
        return o;
    }

    @Override
    public TrainingProgram getById(Long id) {
        return new ObjectIO<TrainingProgram>().read(IOConstant.RQ_PATH);
    }

    @Override
    public List<TrainingProgram> get() {
        return null;
    }

    @Override
    public TrainingProgram update(TrainingProgram o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}