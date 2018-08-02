/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.repoImpl;

import com.jdeps.beira.model.Rejects;
import com.jdeps.beira.repo.RejectsDAO;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lakshan Harischandra
 */
@Repository
public class RejectsDAOImpl implements RejectsDAO {

    @Autowired
    SessionFactory factory;

    @Override
    public boolean saveRejects(Rejects rejects) {
        if (null != factory.getCurrentSession().save(rejects)) {
            return true;
        }
        return false;
    }

    @Override
    public Rejects searchRejects(Long rejectId) {
        Criteria criteria = factory.getCurrentSession().createCriteria(Rejects.class);
        criteria.add(Restrictions.eq("rejectId", rejectId));
        return (Rejects) criteria.uniqueResult();
    }

}
