/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.repoImpl;

import com.jdeps.beira.model.Machineruntime;
import com.jdeps.beira.repo.MachineRuntimeDAO;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lakshan Harischandra
 */
@Repository
public class MachineRuntimeDAOImpl implements MachineRuntimeDAO {

    @Autowired
    SessionFactory factory;

    @Override
    public Machineruntime getNewlyCreatedMachineRunTime() {
        String sql = "select * from machineruntime where machineTimeId = (select max(machineTimeId) from machineruntime) ";
        SQLQuery query = factory.getCurrentSession().createSQLQuery(sql);
        query.addEntity(Machineruntime.class);
        return (Machineruntime) query.uniqueResult();
    }

    @Override
    public boolean save(Machineruntime machineRunTime) {
        if (null != factory.getCurrentSession().save(machineRunTime)) {
            return true;
        }
        return false;
    }

    @Override
    public Machineruntime searchMachineruntime(Long machineTimeId) {
        Criteria criteria = factory.getCurrentSession().createCriteria(Machineruntime.class);
        criteria.add(Restrictions.eq("machineTimeId", machineTimeId));
        return (Machineruntime) criteria.uniqueResult();
    }

}
