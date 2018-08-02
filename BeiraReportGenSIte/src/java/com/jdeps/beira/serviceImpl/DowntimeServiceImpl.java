/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.serviceImpl;

import com.jdeps.beira.model.Downtime;
import com.jdeps.beira.model.Machineruntime;
import com.jdeps.beira.repo.DowntimeDAO;
import com.jdeps.beira.repo.MachineRuntimeDAO;
import com.jdeps.beira.service.DowntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lakshan Harischandra
 */
@Service
@Transactional
public class DowntimeServiceImpl implements DowntimeService {

    @Autowired
    MachineRuntimeDAO machineRuntimeDAO;

    @Autowired
    DowntimeDAO downtimeDAO;

    @Override
    public boolean saveDowntime(Downtime downtime, Long machineRuntimeId) {
        Machineruntime searchedMachineRuntime = machineRuntimeDAO.searchMachineruntime(machineRuntimeId);
        if (null != searchedMachineRuntime) {
            downtime.setDowntimeRuntimeId(new Machineruntime(searchedMachineRuntime.getMachineTimeId()));
            return downtimeDAO.saveDowntime(downtime);
        }
        return false;
    }

    @Override
    public Downtime searchDowntime(Long downtimeId) {
        return downtimeDAO.searchDowntime(downtimeId);
    }

}
