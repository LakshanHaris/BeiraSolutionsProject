/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.controller;

import com.jdeps.beira.model.Packing;
import com.jdeps.beira.service.PackingService;
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
@RequestMapping("packing")
public class PackingController {

    @Autowired
    PackingService packingService;

    @RequestMapping(value = "/savePackingDetails", method = RequestMethod.POST)
    @ResponseBody
    public String savePakingItem(@ModelAttribute("Packing") Packing packing, @RequestParam(value = "productionId") Long productionId, HttpSession session) {

        if (packingService.savePackingItem(packing, productionId)) {
            return "success";
        }
        return "error";
    }
    
    @RequestMapping(value = "/searchPackingDetails", method = RequestMethod.POST)
    @ResponseBody
    public String searchDowntime(@ModelAttribute("Packing") Packing packing, HttpSession session) {

        if (null!=packingService.searchPackingItem(packing.getPackingId())) {
            return "success";
        }
        return "error";
    }
}
