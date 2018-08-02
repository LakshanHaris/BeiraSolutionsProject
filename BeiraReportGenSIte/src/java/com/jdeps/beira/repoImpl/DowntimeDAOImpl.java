/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.repoImpl;

import com.jdeps.beira.model.Downtime;
import com.jdeps.beira.repo.DowntimeDAO;
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
public class DowntimeDAOImpl implements DowntimeDAO {

    @Autowired
    SessionFactory factory;

    @Override
    public boolean saveDowntime(Downtime downtime) {
        if (null != factory.getCurrentSession().save(downtime)) {
            return true;
        }
        return false;
    }

    @Override
    public Downtime searchDowntime(Long downtimeId) {
        Criteria criteria = factory.getCurrentSession().createCriteria(Downtime.class);
        criteria.add(Restrictions.eq("downtimeId", downtimeId));
        return (Downtime) criteria.uniqueResult();
    }

}
