/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.serviceImpl;

import com.jdeps.beira.model.Machineruntime;
import com.jdeps.beira.model.Production;
import com.jdeps.beira.model.Productionitems;
import com.jdeps.beira.model.Shift;
import com.jdeps.beira.repo.MachineRuntimeDAO;
import com.jdeps.beira.repo.ProductionDAO;
import com.jdeps.beira.repo.ShiftRepo;
import com.jdeps.beira.repo.SupervisorRepo;
import com.jdeps.beira.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lakshan Harischandra
 */
@Service
@Transactional
public class ProductionServiceImpl implements ProductionService {

    @Autowired
    SupervisorRepo supervisorRepo;

    @Autowired
    ShiftRepo shiftRepo;

    @Autowired
    ProductionDAO productionDAO;

    @Autowired
    MachineRuntimeDAO machineRuntimeDAO;

    @Override
    public boolean saveProduction(Productionitems productionItems) {

        Shift shift = shiftRepo.getNewlyCreatedShift();
        if (null != shift) {
            Production productionNew = new Production();
            productionNew.setShiftshiftId(new Shift(shift.getShiftId()));
            boolean productionResult = productionDAO.saveProduction(productionNew);
            Production newlyCreatedProduction;

            if (productionResult) {
                newlyCreatedProduction = productionDAO.getNewlyCreatedProduction();
                Machineruntime newlyCreatedRuntime = machineRuntimeDAO.getNewlyCreatedMachineRunTime();
                if (null != newlyCreatedRuntime && null != newlyCreatedProduction) {
                    productionItems.setMachineRunTimemachineTimeId(new Machineruntime(newlyCreatedRuntime.getMachineTimeId()));
                    productionItems.setProductionproductionId(new Production(newlyCreatedProduction.getProductionId()));
                    boolean productionItemResult = productionDAO.saveProductionItems(productionItems);
                    if (productionItemResult) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
