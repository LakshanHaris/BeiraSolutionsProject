/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.controller;

import com.jdeps.beira.model.Supervisor;
import com.jdeps.beira.service.SupervisorService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Lakshan Harischandra
 */
@Controller
@RequestMapping("login")
public class Log_inout_Controller {

    @Autowired
    SupervisorService supervisorService;

    @RequestMapping(value = "/getshiftpage", method = RequestMethod.POST)
    public ModelAndView getShiftPageLogging(@RequestParam(value = "regNumber") int regNumber, @RequestParam(value = "password") String pass, HttpSession session) {

        Supervisor searcedSupervisor = supervisorService.checkCredintials(regNumber, pass);
        System.out.println("output: "+searcedSupervisor);
        ModelAndView mavSupervisor = new ModelAndView();
        if (null != searcedSupervisor) {

            session.setAttribute("regNumber", searcedSupervisor.getId());
            session.setAttribute("name", searcedSupervisor.getName());
            session.setAttribute("password", searcedSupervisor.getPassword());
            mavSupervisor.addObject("searchedSupervisor", searcedSupervisor);
            mavSupervisor.setViewName("supervisor/shift");
            return mavSupervisor;
        } else {
            mavSupervisor.setViewName("errorLogging");
            return mavSupervisor;
        }

    }
    
    @RequestMapping(value = "/userLogOut", method = RequestMethod.GET)
    public String getUserOut(HttpSession session) {

        session.removeAttribute("regNumber");
        session.removeAttribute("password");
        session.removeAttribute("name");
        return "LoginPage";
    }
}
