/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.service;

import com.jdeps.beira.dto.ItemProductionDto;
import com.jdeps.beira.model.Shift;
import com.jdeps.beira.model.Supervisor;
import java.util.Map;

/**
 *
 * @author Lakshan Harischandra
 */
public interface SupervisorService {

    public Supervisor checkCredintials(int regNumber, String pass);

    public boolean  enterShift(Shift shift);

    
}
