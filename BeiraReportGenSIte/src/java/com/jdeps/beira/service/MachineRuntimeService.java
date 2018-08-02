/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.service;

import com.jdeps.beira.model.Machineruntime;

/**
 *
 * @author Lakshan Harischandra
 */
public interface MachineRuntimeService {

    public boolean saveMachineRunTime(Machineruntime machineRunTime);

    public Machineruntime searchMachineRunTime(Long machineTimeId);
    
}
