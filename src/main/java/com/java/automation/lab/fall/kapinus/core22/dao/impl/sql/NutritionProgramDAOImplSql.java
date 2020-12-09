package com.java.automation.lab.fall.kapinus.core22.dao.impl.sql;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.NutritionProgram;
import com.java.automation.lab.fall.kapinus.core22.config.SessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class NutritionProgramDAOImplSql implements DAO<NutritionProgram> {
    private final static String namespace = "nutrition_program_mapper";

    @Override
    public NutritionProgram create(NutritionProgram o)  {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.insert(namespace + ".create", o);
        sqlSession.commit();
        sqlSession.close();
        return null;
    }

    @Override
    public NutritionProgram getById(Long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        NutritionProgram a = sqlSession.selectOne(namespace + ".getById", id);
        sqlSession.close();
        return a;
    }

    @Override
    public List<NutritionProgram> get() {
        SqlSession sqlSession = SessionFactory.getSession();
        List<NutritionProgram> as = sqlSession.selectList(namespace + ".get");
        sqlSession.close();
        return as;
    }

    @Override
    public NutritionProgram update(NutritionProgram o){
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
