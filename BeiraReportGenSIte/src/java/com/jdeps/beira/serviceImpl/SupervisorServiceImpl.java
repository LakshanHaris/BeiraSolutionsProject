/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.serviceImpl;

import com.jdeps.beira.model.Downtime;
import com.jdeps.beira.model.Machineruntime;
import com.jdeps.beira.model.Production;
import com.jdeps.beira.model.Productionitems;
import com.jdeps.beira.model.Rejects;
import com.jdeps.beira.model.Shift;
import com.jdeps.beira.model.Supervisor;
import com.jdeps.beira.repo.ShiftRepo;
import com.jdeps.beira.repo.SupervisorRepo;
import com.jdeps.beira.service.SupervisorService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lakshan Harischandra
 */
@Service
@Transactional
public class SupervisorServiceImpl implements SupervisorService {

    @Autowired
    SupervisorRepo supervisorRepo;

    @Autowired
    ShiftRepo shiftRepo;

    @Override
    public Supervisor checkCredintials(int regNumber, String pass) {
        return supervisorRepo.checkCredintials(regNumber, pass);
    }

    @Override
    public boolean enterShift(Shift shift) {
        if (null != shiftRepo.enterShift(shift)) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean itemProductionDetails(Map map) {

        Shift shift = shiftRepo.getNewlyCreatedShift();
        Production production = new Production();
        production.setShiftshiftId(new Shift(shift.getShiftId()));
        boolean productionResult = shiftRepo.saveProduction(production);
        Production newlyCreatedProduction = null;
        if (productionResult) {
            newlyCreatedProduction = shiftRepo.getNewlyCreatedProduction();
        }

        Machineruntime machineruntime = new Machineruntime();
        machineruntime.setFromRuntime((String) map.get("runtimeFrom"));
        machineruntime.setToRuntime((String) map.get("runtimeTo"));
        machineruntime.setPartNumber((String) map.get("partNumber"));
        machineruntime.setNoOfMinutesRuntime((String) map.get("disabledInputRun"));

        boolean machineRunTimeResult = shiftRepo.saveMachineRunTime(machineruntime);
        Machineruntime newlyCreatedRuntime = shiftRepo.getNewlyCreatedMachineRunTime();

        if (true == machineRunTimeResult && true == productionResult) {

            Productionitems productionitems = new Productionitems();
            productionitems.setsOnumber((String) map.get("soNumber"));
            productionitems.setCustomer((String) map.get("customer"));
            productionitems.setPartNumber((String) map.get("partNumber"));
            productionitems.setProducedQty((String) map.get("producedQty"));
            productionitems.setNewCartons(Integer.valueOf((String) map.get("cartonsNew")));
            productionitems.setUsedCartons(Integer.valueOf((String) map.get("cartonsUsed")));
            productionitems.setBags(Integer.valueOf((String) map.get("bags")));
            productionitems.setDie((String) map.get("die"));
            productionitems.setMachineRunTimemachineTimeId(new Machineruntime(newlyCreatedRuntime.getMachineTimeId()));
            productionitems.setProductionproductionId(new Production(newlyCreatedProduction.getProductionId()));

            boolean productionItemResult = shiftRepo.saveProductionItem(productionitems);
            Productionitems newlyCreatedProductionItem = shiftRepo.getNewlyCreatedProductionItem();

            if (productionItemResult) {

                Rejects rejects = new Rejects();
                rejects.setMetalDetector(Integer.valueOf((String) map.get("metalDetector")));
                rejects.setBackFlush(Integer.valueOf((String) map.get("backFlush")));
                rejects.setLineChange(Integer.valueOf((String) map.get("lineChange")));
                rejects.setLineRejects(Integer.valueOf((String) map.get("lineRejects")));
                rejects.setOther(Integer.valueOf((String) map.get("other")));
                rejects.setProductionItemsitemId(new Productionitems(newlyCreatedProductionItem.getItemId()));
                boolean rejectResult = shiftRepo.saveRejects(rejects);

                if (rejectResult) {
                    int count = 0;
                    List downTimeList = (List) map.get("downtimeArr");
                    System.out.println("New map" + downTimeList);
                    for (int i = 0; i <= downTimeList.size(); i++) {

                        
                        Map<String, Object> downTimeMap = new HashMap<String, Object>();
                        downTimeMap.put(i+"", downTimeList.get(i));
                        System.out.println("Map obj"+downTimeMap.get(i+""));
                        
                        Map<String, Object> downTimeValueMap = new HashMap<String, Object>();
                        downTimeValueMap.put(i+"", downTimeMap.get(i+""));
                        System.out.println("Map value inside"+downTimeValueMap.get("status"));
//                        Downtime downtime = downTimeMap.get(i);
//                        Downtime downtimeObj = new Downtime();
//                        downtimeObj.setFromDowntime(downtimeListObj.getFromDowntime());
//                        downtimeObj.setToDowntime(downtimeListObj.getToDowntime());
//                        downtimeObj.setNoOfMinutesDowntime(downtimeListObj.getNoOfMinutesDowntime());
//                        downtimeObj.setStatus(downtimeListObj.getStatus());
//                        downtimeObj.setReason(downtimeListObj.getReason());
//                        downtimeObj.setComment(downtimeListObj.getComment());
//                        downtimeObj.setDowntimeRuntimeId(new Machineruntime(newlyCreatedRuntime.getMachineTimeId()));
//                        boolean downtimeResult = shiftRepo.saveDowntime(downtimeObj);
//                        if (downtimeResult) {
//                            count++;
//                        }
                    }
                    if (0 != count) {
                        return true;
                    }
                }
            }

        }
        return false;
    }

}
