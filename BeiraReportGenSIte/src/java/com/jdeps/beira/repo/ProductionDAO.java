/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.repo;

import com.jdeps.beira.model.Production;
import com.jdeps.beira.model.Productionitems;

/**
 *
 * @author Lakshan Harischandra
 */
public interface ProductionDAO {

    public boolean saveProduction(Production production);

    public boolean saveProductionItems(Productionitems productionItems);

    public Production getNewlyCreatedProduction();

    public Productionitems searchProdutionItem(Long productionItemId);

    public Production searchProductionId(Long productionId);
}
