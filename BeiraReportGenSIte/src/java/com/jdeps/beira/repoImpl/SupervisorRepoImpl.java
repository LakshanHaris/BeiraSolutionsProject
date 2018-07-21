/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.repoImpl;

import com.jdeps.beira.model.Shift;
import com.jdeps.beira.model.Supervisor;
import com.jdeps.beira.repo.SupervisorRepo;
import java.io.Serializable;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lakshan Harischandra
 */
@Repository
public class SupervisorRepoImpl implements SupervisorRepo {

    @Autowired
    SessionFactory factory;

    @Override
    public Supervisor checkCredintials(int regNumber, String pass) {
        Criteria criteria = factory.getCurrentSession().createCriteria(Supervisor.class);

        Criterion id = Restrictions.eq("id", regNumber);
        Criterion password = Restrictions.eq("password", pass);
        LogicalExpression andExp = Restrictions.and(id, password);
        criteria.add(andExp);

        return (Supervisor) criteria.uniqueResult();

    }

    

}
