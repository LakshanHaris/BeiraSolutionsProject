/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.service;

import com.jdeps.beira.model.Rejects;

/**
 *
 * @author Lakshan Harischandra
 */
public interface RejectsService {

    public boolean saveRejects(Rejects rejects,Long productionItemId);

    public Rejects searchRejects(Long rejectId);
    
}
