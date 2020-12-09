package com.java.automation.lab.fall.kapinus.core22.dao.impl.sql;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Adress;
import com.java.automation.lab.fall.kapinus.core22.config.SessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class AdressDAOImplSql implements DAO<Adress> {
    private final static String namespace = "adress_mapper";

    @Override
    public Adress create(Adress o)  {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.insert(namespace + ".create", o);
        sqlSession.commit();
        sqlSession.close();
        return null;
    }

    @Override
    public Adress getById(Long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        Adress a = sqlSession.selectOne(namespace + ".getById", id);
        sqlSession.close();
        return a;
    }

    @Override
    public List<Adress> get() {
        SqlSession sqlSession = SessionFactory.getSession();
        List<Adress> as = sqlSession.selectList(namespace + ".get");
        sqlSession.close();
        return as;
    }

    @Override
    public Adress update(Adress o){
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
