/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.repoImpl;

import com.jdeps.beira.model.Packing;
import com.jdeps.beira.repo.PackingDAO;
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
public class PackingDAOImpl implements PackingDAO {

    @Autowired
    SessionFactory factory;

    @Override
    public boolean savePackingItem(Packing packing) {
        if (null != factory.getCurrentSession().save(packing)) {
            return true;
        }
        return false;
    }

    @Override
    public Packing searchPackingItem(Integer packingId) {
        Criteria criteria = factory.getCurrentSession().createCriteria(Packing.class);
        criteria.add(Restrictions.eq("packingId", packingId));
        return (Packing) criteria.uniqueResult();
    }

}
