package com.java.automation.lab.fall.kapinus.core22.dao.impl.sql;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.NutritionFacts;
import com.java.automation.lab.fall.kapinus.core22.io.SessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class NutritionFactsDAOImplSql implements DAO<NutritionFacts> {
    private final static String namespace = "nutrition_facts_mapper";

    @Override
    public NutritionFacts create(NutritionFacts o)  {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.insert(namespace + ".create", o);
        sqlSession.commit();
        sqlSession.close();
        return null;
    }

    @Override
    public NutritionFacts getById(Long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        NutritionFacts a = sqlSession.selectOne(namespace + ".getById", id);
        sqlSession.close();
        return a;
    }

    @Override
    public List<NutritionFacts> get() {
        SqlSession sqlSession = SessionFactory.getSession();
        List<NutritionFacts> as = sqlSession.selectList(namespace + ".get");
        sqlSession.close();
        return as;
    }

    @Override
    public NutritionFacts update(NutritionFacts o){
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
