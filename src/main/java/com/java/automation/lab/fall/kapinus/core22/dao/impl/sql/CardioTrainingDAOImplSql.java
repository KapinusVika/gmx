package com.java.automation.lab.fall.kapinus.core22.dao.impl.sql;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.CardioTraining;
import com.java.automation.lab.fall.kapinus.core22.io.SessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CardioTrainingDAOImplSql implements DAO<CardioTraining> {
    private final static String namespace = "cardio_training_mapper";

    @Override
    public CardioTraining create(CardioTraining o)  {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.insert(namespace + ".create", o);
        sqlSession.commit();
        sqlSession.close();
        return null;
    }

    @Override
    public CardioTraining getById(Long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        CardioTraining a = sqlSession.selectOne(namespace + ".getById", id);
        sqlSession.close();
        return a;
    }

    @Override
    public List<CardioTraining> get() {
        SqlSession sqlSession = SessionFactory.getSession();
        List<CardioTraining> as = sqlSession.selectList(namespace + ".get");
        sqlSession.close();
        return as;
    }

    @Override
    public CardioTraining update(CardioTraining o){
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