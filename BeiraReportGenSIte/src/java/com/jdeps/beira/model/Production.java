/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.model;


import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Lakshan Harischandra
 */
@Entity
@Table(name = "production")

public class Production implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "productionId")
    private Long productionId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productionproductionId")
    private List<Productionitems> productionitemsList;
    @JoinColumn(name = "Shift_shiftId", referencedColumnName = "shiftId")
    @ManyToOne(optional = false)
    private Shift shiftshiftId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productionPackingId")
    private List<Packing> packingItemList;

    public Production() {
    }

    public Production(Long productionId) {
        this.productionId = productionId;
    }

    public Long getProductionId() {
        return productionId;
    }

    public void setProductionId(Long productionId) {
        this.productionId = productionId;
    }

    public List<Productionitems> getProductionitemsList() {
        return productionitemsList;
    }

    public void setProductionitemsList(List<Productionitems> productionitemsList) {
        this.productionitemsList = productionitemsList;
    }

    

    public Shift getShiftshiftId() {
        return shiftshiftId;
    }

    public void setShiftshiftId(Shift shiftshiftId) {
        this.shiftshiftId = shiftshiftId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productionId != null ? productionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Production)) {
            return false;
        }
        Production other = (Production) object;
        if ((this.productionId == null && other.productionId != null) || (this.productionId != null && !this.productionId.equals(other.productionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jcodetechnologies.beira.model.Production[ productionId=" + productionId + " ]";
    }

    /**
     * @return the packingItemList
     */
    public List<Packing> getPackingItemList() {
        return packingItemList;
    }

    /**
     * @param packingItemList the packingItemList to set
     */
    public void setPackingItemList(List<Packing> packingItemList) {
        this.packingItemList = packingItemList;
    }
    
}
