package com.java.automation.lab.fall.kapinus.core22.dao.impl.sql;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Client;
import com.java.automation.lab.fall.kapinus.core22.config.SessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ClientDAOImplSql implements DAO<Client> {
    private final static String namespace = "client_mapper";

    @Override
    public Client create(Client o)  {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.insert(namespace + ".create", o);
        sqlSession.commit();
        sqlSession.close();
        return null;
    }

    @Override
    public Client getById(Long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        Client a = sqlSession.selectOne(namespace + ".getById", id);
        sqlSession.close();
        return a;
    }

    @Override
    public List<Client> get() {
        SqlSession sqlSession = SessionFactory.getSession();
        List<Client> as = sqlSession.selectList(namespace + ".get");
        sqlSession.close();
        return as;
    }

    @Override
    public Client update(Client o){
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
