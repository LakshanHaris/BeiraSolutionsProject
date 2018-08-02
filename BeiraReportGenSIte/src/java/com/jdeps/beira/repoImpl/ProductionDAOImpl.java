/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.repoImpl;

import com.jdeps.beira.model.Production;
import com.jdeps.beira.model.Productionitems;
import com.jdeps.beira.repo.ProductionDAO;
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
public class ProductionDAOImpl implements ProductionDAO {

    @Autowired
    SessionFactory factory;

    @Override
    public boolean saveProduction(Production production) {
        if (null != factory.getCurrentSession().save(production)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean saveProductionItems(Productionitems productionItems) {
        if (null != factory.getCurrentSession().save(productionItems)) {
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
    public Productionitems searchProdutionItem(Long productionItemId) {
        Criteria criteria = factory.getCurrentSession().createCriteria(Productionitems.class);
        criteria.add(Restrictions.eq("itemId", productionItemId));
        return (Productionitems) criteria.uniqueResult();
    }

    @Override
    public Production searchProductionId(Long productionId) {
        Criteria criteria = factory.getCurrentSession().createCriteria(Production.class);
        criteria.add(Restrictions.eq("productionId", productionId));
        return (Production) criteria.uniqueResult();
    }

}
