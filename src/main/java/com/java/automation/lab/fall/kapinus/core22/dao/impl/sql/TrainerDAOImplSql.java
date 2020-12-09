package com.java.automation.lab.fall.kapinus.core22.dao.impl.sql;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Trainer;
import com.java.automation.lab.fall.kapinus.core22.config.SessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TrainerDAOImplSql implements DAO<Trainer> {
    private final static String namespace = "trainer_mapper";

    @Override
    public Trainer create(Trainer o)  {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.insert(namespace + ".create", o);
        sqlSession.commit();
        sqlSession.close();
        return null;
    }

    @Override
    public Trainer getById(Long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        Trainer a = sqlSession.selectOne(namespace + ".getById", id);
        sqlSession.close();
        return a;
    }

    @Override
    public List<Trainer> get() {
        SqlSession sqlSession = SessionFactory.getSession();
        List<Trainer> as = sqlSession.selectList(namespace + ".get");
        sqlSession.close();
        return as;
    }

    @Override
    public Trainer update(Trainer o){
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
