/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.repo;

import com.jdeps.beira.model.Downtime;
import com.jdeps.beira.model.Machineruntime;
import com.jdeps.beira.model.Production;
import com.jdeps.beira.model.Productionitems;
import com.jdeps.beira.model.Rejects;
import com.jdeps.beira.model.Shift;
import java.io.Serializable;

/**
 *
 * @author Lakshan Harischandra
 */
public interface ShiftRepo {

    public Shift getNewlyCreatedShift();

    public Serializable enterShift(Shift shift);

}
