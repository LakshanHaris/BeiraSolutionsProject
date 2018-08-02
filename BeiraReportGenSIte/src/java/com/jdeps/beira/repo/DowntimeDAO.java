/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.repo;

import com.jdeps.beira.model.Downtime;

/**
 *
 * @author Lakshan Harischandra
 */
public interface DowntimeDAO {

    public boolean saveDowntime(Downtime downtime);

    public Downtime searchDowntime(Long downtimeId);
    
}
