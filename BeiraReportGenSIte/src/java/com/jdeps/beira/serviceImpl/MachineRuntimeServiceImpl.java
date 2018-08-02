/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.serviceImpl;

import com.jdeps.beira.model.Machineruntime;
import com.jdeps.beira.repo.MachineRuntimeDAO;
import com.jdeps.beira.service.MachineRuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lakshan Harischandra
 */
@Service
@Transactional
public class MachineRuntimeServiceImpl implements MachineRuntimeService {

    @Autowired
    MachineRuntimeDAO machineRuntimeDAO;

    @Override
    public boolean saveMachineRunTime(Machineruntime machineRunTime) {
        return machineRuntimeDAO.save(machineRunTime);
    }

    @Override
    public Machineruntime searchMachineRunTime(Long machineTimeId) {
        return machineRuntimeDAO.searchMachineruntime(machineTimeId);
    }

}
