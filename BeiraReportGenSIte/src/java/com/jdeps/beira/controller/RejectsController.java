/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.controller;

import com.jdeps.beira.model.Rejects;
import com.jdeps.beira.service.RejectsService;
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
@RequestMapping("rejects")
public class RejectsController {
    
    @Autowired
    RejectsService rejectsService;
    
    @RequestMapping(value = "/saveRejectsDetails", method = RequestMethod.POST)
    @ResponseBody
    public String saveRejects(@ModelAttribute("Rejects") Rejects rejects,@RequestParam(value = "productionItemId") Long productionItemId, HttpSession session) {

        if (rejectsService.saveRejects(rejects,productionItemId)) {
            return "success";
        }
        return "error";
    }
    
    @RequestMapping(value = "/searchRejectsDetails", method = RequestMethod.POST)
    @ResponseBody
    public String searchRejects(@ModelAttribute("Rejects") Rejects rejects, HttpSession session) {

        if (null!=rejectsService.searchRejects(rejects.getRejectId())) {
            return "success";
        }
        return "error";
    }
}
