/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.repo;

import com.jdeps.beira.model.Machineruntime;

/**
 *
 * @author Lakshan Harischandra
 */
public interface MachineRuntimeDAO {

    public Machineruntime getNewlyCreatedMachineRunTime();

    public boolean save(Machineruntime machineRunTime);

    public Machineruntime searchMachineruntime(Long machineTimeId);
    
}
