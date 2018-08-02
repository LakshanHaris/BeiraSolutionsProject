/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.repo;

import com.jdeps.beira.model.Rejects;

/**
 *
 * @author Lakshan Harischandra
 */
public interface RejectsDAO {

    public boolean saveRejects(Rejects rejects);

    public Rejects searchRejects(Long rejectId);
    
}
