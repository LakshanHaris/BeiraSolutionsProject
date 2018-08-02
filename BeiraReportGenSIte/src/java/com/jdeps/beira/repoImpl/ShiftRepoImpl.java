/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.repoImpl;

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

}
