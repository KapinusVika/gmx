package com.java.automation.lab.fall.kapinus.core22.dao.impl.sql;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.PowerEquipment;
import com.java.automation.lab.fall.kapinus.core22.io.SessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class PowerEquipmentDAOImplSql implements DAO<PowerEquipment> {
    private final static String namespace = "power_equipment_mapper";

    @Override
    public PowerEquipment create(PowerEquipment o)  {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.insert(namespace + ".create", o);
        sqlSession.commit();
        sqlSession.close();
        return null;
    }

    @Override
    public PowerEquipment getById(Long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        PowerEquipment a = sqlSession.selectOne(namespace + ".getById", id);
        sqlSession.close();
        return a;
    }

    @Override
    public List<PowerEquipment> get() {
        SqlSession sqlSession = SessionFactory.getSession();
        List<PowerEquipment> as = sqlSession.selectList(namespace + ".get");
        sqlSession.close();
        return as;
    }

    @Override
    public PowerEquipment update(PowerEquipment o){
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
