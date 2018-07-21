/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.controller;

import com.jdeps.beira.dto.ItemProductionDto;
import com.jdeps.beira.model.Downtime;
import com.jdeps.beira.model.Shift;
import com.jdeps.beira.model.Supervisor;
import com.jdeps.beira.service.SupervisorService;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Lakshan Harischandra
 */
@Controller
@RequestMapping("supervisior")
public class SupervisiorController {

    @Autowired
    SupervisorService supervisorService;

    @RequestMapping(value = "/enterShiftDetails", method = RequestMethod.POST)
    @ResponseBody
    public String enterShift(@ModelAttribute("Shift") Shift shift, HttpSession session) {

        shift.setSupervisorid(new Supervisor((int) session.getAttribute("regNumber")));
        if (supervisorService.enterShift(shift)) {
            return "success";
        }
        return "error";
    }

    @RequestMapping(value = "/saveItemData", method = RequestMethod.POST)
    @ResponseBody
    public String saveItemData(@RequestBody String item, HttpSession session) {

        try {
            ObjectMapper mapper = new ObjectMapper();
            Map<String, Object> map = mapper.readValue(item, Map.class);
            System.out.println("Item Object :" + map);
            System.out.println("Item Object :" + map.get("downtimeArr"));
            if (supervisorService.itemProductionDetails(map)) {
                return "success";
            }

        } catch (IOException ex) {
            Logger.getLogger(SupervisiorController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "error";
    }
}
