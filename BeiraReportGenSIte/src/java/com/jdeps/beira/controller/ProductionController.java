/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.controller;

import com.jdeps.beira.model.Productionitems;
import com.jdeps.beira.service.ProductionService;
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
@RequestMapping("production")
public class ProductionController {
    
    @Autowired
    ProductionService productionService;
    
    @RequestMapping(value = "/saveProductionDetails", method = RequestMethod.POST)
    @ResponseBody
    public String saveProduction(@ModelAttribute("Productionitems") Productionitems productionItems, HttpSession session) {

        
        if (productionService.saveProduction(productionItems)) {
            return "success";
        }
        return "error";
    }
    
    @RequestMapping(value = "/searchProductionDetails", method = RequestMethod.POST)
    @ResponseBody
    public String searchProduction(@ModelAttribute("Productionitems") Productionitems productionItems, HttpSession session) {

        return "error";
    }
}
