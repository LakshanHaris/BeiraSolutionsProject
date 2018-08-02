/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.service;

import com.jdeps.beira.model.Packing;

/**
 *
 * @author Lakshan Harischandra
 */
public interface PackingService {

    public boolean savePackingItem(Packing packing, Long productionId);

    public Packing searchPackingItem(Integer packingId);
    
}
