package com.java.automation.lab.fall.kapinus.core22.dao.impl.sql;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.GroupTraining;
import com.java.automation.lab.fall.kapinus.core22.config.SessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class GroupTrainingDAOImplSql implements DAO<GroupTraining> {
    private final static String namespace = "group_training_mapper";

    @Override
    public GroupTraining create(GroupTraining o)  {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.insert(namespace + ".create", o);
        sqlSession.commit();
        sqlSession.close();
        return null;
    }

    @Override
    public GroupTraining getById(Long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        GroupTraining a = sqlSession.selectOne(namespace + ".getById", id);
        sqlSession.close();
        return a;
    }

    @Override
    public List<GroupTraining> get() {
        SqlSession sqlSession = SessionFactory.getSession();
        List<GroupTraining> as = sqlSession.selectList(namespace + ".get");
        sqlSession.close();
        return as;
    }

    @Override
    public GroupTraining update(GroupTraining o){
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
