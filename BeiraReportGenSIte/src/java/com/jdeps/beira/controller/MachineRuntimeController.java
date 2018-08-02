/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.controller;

import com.jdeps.beira.model.Machineruntime;
import com.jdeps.beira.service.MachineRuntimeService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Lakshan Harischandra
 */
@Controller
@RequestMapping("machineruntime")
public class MachineRuntimeController {
    
    @Autowired
    MachineRuntimeService machineRuntimeService;
    
    @RequestMapping(value = "/saveMachineRunTimeDetails", method = RequestMethod.POST)
    @ResponseBody
    public String saveMachineRuntime(@ModelAttribute("Machineruntime") Machineruntime machineRunTime, HttpSession session) {

        
        if (machineRuntimeService.saveMachineRunTime(machineRunTime)) {
            return "success";
        }
        return "error";
    }
    
    
    @RequestMapping(value = "/searchMachineRunTimeDetails", method = RequestMethod.POST)
    @ResponseBody
    public String searchMachineRuntime(@ModelAttribute("Machineruntime") Machineruntime machineRunTime, HttpSession session) {

        
        if (null!=machineRuntimeService.searchMachineRunTime(machineRunTime.getMachineTimeId())) {
            return "success";
        }
        return "error";
    }
    
}
