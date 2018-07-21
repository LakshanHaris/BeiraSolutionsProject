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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Lakshan Harischandra
 */
@Entity
@Table(name = "packing")

public class Packing implements Serializable {

    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "packingId")
    private Integer packingId;
    @Size(max = 70)
    @Column(name = "partNumber")
    private String partNumber;
    @Size(max = 45)
    @Column(name = "startTime")
    private String from;
    @Size(max = 45)
    @Column(name = "endTime")
    private String to;
    @Size(max = 45)
    @Column(name = "noOfMinutes")
    private String noOfMinutes;
    @Size(max = 4)
    @Column(name = "tea1")
    private String tea1;
    @Size(max = 4)
    @Column(name = "tea2")
    private String tea2;
    @Size(max = 4)
    @Column(name = "lunch_dinner")
    private String lunchDinner;
    @JoinColumn(name = "Production_productionId", referencedColumnName = "productionId")
    @ManyToOne(optional = false)
    private Production productionPackingId;

    public Packing() {
    }

    public Packing(Integer packingId) {
        this.packingId = packingId;
    }

    public Integer getPackingId() {
        return packingId;
    }

    public void setPackingId(Integer packingId) {
        this.packingId = packingId;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getNoOfMinutes() {
        return noOfMinutes;
    }

    public void setNoOfMinutes(String noOfMinutes) {
        this.noOfMinutes = noOfMinutes;
    }

    public String getTea1() {
        return tea1;
    }

    public void setTea1(String tea1) {
        this.tea1 = tea1;
    }

    public String getTea2() {
        return tea2;
    }

    public void setTea2(String tea2) {
        this.tea2 = tea2;
    }

    public String getLunchDinner() {
        return lunchDinner;
    }

    public void setLunchDinner(String lunchDinner) {
        this.lunchDinner = lunchDinner;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (packingId != null ? packingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Packing)) {
            return false;
        }
        Packing other = (Packing) object;
        if ((this.packingId == null && other.packingId != null) || (this.packingId != null && !this.packingId.equals(other.packingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jcodetechnologies.beira.model.Packing[ packingId=" + packingId + " ]";
    }

    /**
     * @return the productionPackingId
     */
    public Production getProductionPackingId() {
        return productionPackingId;
    }

    /**
     * @param productionPackingId the productionPackingId to set
     */
    public void setProductionPackingId(Production productionPackingId) {
        this.productionPackingId = productionPackingId;
    }

   
    
}
