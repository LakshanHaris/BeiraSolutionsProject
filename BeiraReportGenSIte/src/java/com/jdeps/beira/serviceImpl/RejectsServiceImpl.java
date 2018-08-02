/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.serviceImpl;

import com.jdeps.beira.model.Productionitems;
import com.jdeps.beira.model.Rejects;
import com.jdeps.beira.repo.ProductionDAO;
import com.jdeps.beira.repo.RejectsDAO;
import com.jdeps.beira.service.RejectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lakshan Harischandra
 */
@Service
@Transactional
public class RejectsServiceImpl implements RejectsService {

    @Autowired
    RejectsDAO rejectsDAO;

    @Autowired
    ProductionDAO productionDAO;

    @Override
    public boolean saveRejects(Rejects rejects, Long productionItemId) {
        Productionitems searchedroductionItem = productionDAO.searchProdutionItem(productionItemId);
        if (null != searchedroductionItem) {
            rejects.setProductionItemsitemId(new Productionitems(searchedroductionItem.getItemId()));
            return rejectsDAO.saveRejects(rejects);
        }
        return false;
    }

    @Override
    public Rejects searchRejects(Long rejectId) {
        return rejectsDAO.searchRejects(rejectId);
    }

}
