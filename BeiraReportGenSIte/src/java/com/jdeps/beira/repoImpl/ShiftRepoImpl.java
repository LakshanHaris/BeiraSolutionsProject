/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.repoImpl;

import com.jdeps.beira.model.Downtime;
import com.jdeps.beira.model.Machineruntime;
import com.jdeps.beira.model.Production;
import com.jdeps.beira.model.Productionitems;
import com.jdeps.beira.model.Rejects;
import com.jdeps.beira.model.Shift;
import com.jdeps.beira.repo.ShiftRepo;
import java.io.Serializable;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lakshan Harischandra
 */
@Repository
public class ShiftRepoImpl implements ShiftRepo {

    @Autowired
    SessionFactory factory;

    @Override
    public Shift getNewlyCreatedShift() {
        String sql = "select * from shift where shiftId = (select max(shiftId) from shift) ";
        SQLQuery query = factory.getCurrentSession().createSQLQuery(sql);
        query.addEntity(Shift.class);
        return (Shift) query.uniqueResult();
    }

    @Override
    public Serializable enterShift(Shift shift) {
        return factory.getCurrentSession().save(shift);
    }

    @Override
    public Machineruntime getNewlyCreatedMachineRunTime() {
        String sql = "select * from machineruntime where machineTimeId = (select max(machineTimeId) from machineruntime) ";
        SQLQuery query = factory.getCurrentSession().createSQLQuery(sql);
        query.addEntity(Machineruntime.class);
        return (Machineruntime) query.uniqueResult();
    }

    @Override
    public boolean saveMachineRunTime(Machineruntime machineruntime) {

        if (null != factory.getCurrentSession().save(machineruntime)) {
            return true;
        }
        return false;

    }

    @Override
    public boolean saveProduction(Production production) {
        if (null != factory.getCurrentSession().save(production)) {
            return true;
        }
        return false;
    }

    @Override
    public Production getNewlyCreatedProduction() {
        String sql = "select * from production where productionId = (select max(productionId) from production)";
        SQLQuery query = factory.getCurrentSession().createSQLQuery(sql);
        query.addEntity(Production.class);
        return (Production) query.uniqueResult();
    }

    @Override
    public boolean saveProductionItem(Productionitems productionitems) {
        if (null != factory.getCurrentSession().save(productionitems)) {
            return true;
        }
        return false;
    }

    @Override
    public Productionitems getNewlyCreatedProductionItem() {
        String sql = "select * from productionitems where itemId = (select max(itemId) from productionitems) ";
        SQLQuery query = factory.getCurrentSession().createSQLQuery(sql);
        query.addEntity(Productionitems.class);
        return (Productionitems) query.uniqueResult();
    }

    @Override
    public boolean saveRejects(Rejects rejects) {
        if (null != factory.getCurrentSession().save(rejects)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean saveDowntime(Downtime downtimeObj) {
        if (null != factory.getCurrentSession().save(downtimeObj)) {
            return true;
        }
        return false;
    }

}
