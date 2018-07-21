/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.repo;

import com.jdeps.beira.model.Shift;
import com.jdeps.beira.model.Supervisor;
import java.io.Serializable;

/**
 *
 * @author Lakshan Harischandra
 */
public interface SupervisorRepo {

    public Supervisor checkCredintials(int regNumber, String pass);

}
