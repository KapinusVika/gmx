package com.java.automation.lab.fall.kapinus.core22.dao.impl.sql;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.TrainingProgram;
import com.java.automation.lab.fall.kapinus.core22.io.SessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TrainingProgramDAOImplSql implements DAO<TrainingProgram> {
    private final static String namespace = "training_program_mapper";

    @Override
    public TrainingProgram create(TrainingProgram o)  {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.insert(namespace + ".create", o);
        sqlSession.commit();
        sqlSession.close();
        return null;
    }

    @Override
    public TrainingProgram getById(Long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        TrainingProgram a = sqlSession.selectOne(namespace + ".getById", id);
        sqlSession.close();
        return a;
    }

    @Override
    public List<TrainingProgram> get() {
        SqlSession sqlSession = SessionFactory.getSession();
        List<TrainingProgram> as = sqlSession.selectList(namespace + ".get");
        sqlSession.close();
        return as;
    }

    @Override
    public TrainingProgram update(TrainingProgram o){
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.update(namespace + ".update", o);
        sqlSession.commit();
        sqlSession.close();
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.delete(namespace + ".deleteById", id);
        sqlSession.commit();
        sqlSession.close();
        return null;
    }
}
