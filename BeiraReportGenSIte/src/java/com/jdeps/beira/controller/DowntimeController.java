/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.controller;

import com.jdeps.beira.model.Downtime;
import com.jdeps.beira.service.DowntimeService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Lakshan Harischandra
 */
@Controller
@RequestMapping("downtime")
public class DowntimeController {

    @Autowired
    DowntimeService downtimeService;

    @RequestMapping(value = "/saveDowntimeDetails", method = RequestMethod.POST)
    @ResponseBody
    public String saveDowntime(@ModelAttribute("Downtime") Downtime downtime, @RequestParam(value = "machineRuntimeId") Long machineRuntimeId, HttpSession session) {

        if (downtimeService.saveDowntime(downtime, machineRuntimeId)) {
            return "success";
        }
        return "error";
    }
    
   @RequestMapping(value = "/searchDowntimeDetails", method = RequestMethod.POST)
    @ResponseBody
    public String searchDowntime(@ModelAttribute("Downtime") Downtime downtime, HttpSession session) {

        if (null!=downtimeService.searchDowntime(downtime.getDowntimeId())) {
            return "success";
        }
        return "error";
    }
}
