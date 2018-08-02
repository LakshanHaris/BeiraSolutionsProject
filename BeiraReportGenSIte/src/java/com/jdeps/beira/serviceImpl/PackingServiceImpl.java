/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.serviceImpl;

import com.jdeps.beira.model.Packing;
import com.jdeps.beira.model.Production;
import com.jdeps.beira.repo.PackingDAO;
import com.jdeps.beira.repo.ProductionDAO;
import com.jdeps.beira.service.PackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lakshan Harischandra
 */
@Service
@Transactional
public class PackingServiceImpl implements PackingService {

    @Autowired
    ProductionDAO productionDAO;

    @Autowired
    PackingDAO packingDAO;

    @Override
    public boolean savePackingItem(Packing packing, Long productionId) {
        Production searchedProduction = productionDAO.searchProductionId(productionId);
        if (null != searchedProduction) {
            packing.setProductionPackingId(new Production(searchedProduction.getProductionId()));
            return packingDAO.savePackingItem(packing);
        }
        return false;
    }

    @Override
    public Packing searchPackingItem(Integer packingId) {
        return packingDAO.searchPackingItem(packingId);
    }

}
