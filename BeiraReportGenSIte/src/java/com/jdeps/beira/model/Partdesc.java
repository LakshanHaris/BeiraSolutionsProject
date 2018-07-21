/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Lakshan Harischandra
 */
@Entity
@Table(name = "partdesc")

public class Partdesc implements Serializable {

    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "partId")
    private Long partId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "partNumber")
    private String partNumber;
    @Column(name = "SEO_both_die")
    private Integer sEObothdie;
    @Column(name = "SEO_single_die")
    private Integer sEOsingledie;
    @Size(max = 45)
    @Column(name = "cutterWastageInPercent")
    private String cutterWastageInPercent;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cutterWastageInKg")
    private BigDecimal cutterWastageInKg;
    @Column(name = "SPO_both_die")
    private Integer sPObothdie;
    @Column(name = "SPO_single_die")
    private Integer sPOsingledie;
    @JoinColumn(name = "Admin_adminId", referencedColumnName = "adminId")
    @ManyToOne(optional = false)
    private Admin adminadminId;
    
    public Partdesc() {
    }

    public Partdesc(Long partId) {
        this.partId = partId;
    }

    public Partdesc(Long partId, String partNumber) {
        this.partId = partId;
        this.partNumber = partNumber;
    }

    public Long getPartId() {
        return partId;
    }

    public void setPartId(Long partId) {
        this.partId = partId;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public Integer getSEObothdie() {
        return sEObothdie;
    }

    public void setSEObothdie(Integer sEObothdie) {
        this.sEObothdie = sEObothdie;
    }

    public Integer getSEOsingledie() {
        return sEOsingledie;
    }

    public void setSEOsingledie(Integer sEOsingledie) {
        this.sEOsingledie = sEOsingledie;
    }

    public String getCutterWastageInPercent() {
        return cutterWastageInPercent;
    }

    public void setCutterWastageInPercent(String cutterWastageInPercent) {
        this.cutterWastageInPercent = cutterWastageInPercent;
    }

    public BigDecimal getCutterWastageInKg() {
        return cutterWastageInKg;
    }

    public void setCutterWastageInKg(BigDecimal cutterWastageInKg) {
        this.cutterWastageInKg = cutterWastageInKg;
    }

    public Integer getSPObothdie() {
        return sPObothdie;
    }

    public void setSPObothdie(Integer sPObothdie) {
        this.sPObothdie = sPObothdie;
    }

    public Integer getSPOsingledie() {
        return sPOsingledie;
    }

    public void setSPOsingledie(Integer sPOsingledie) {
        this.sPOsingledie = sPOsingledie;
    }

    

    public Admin getAdminadminId() {
        return adminadminId;
    }

    public void setAdminadminId(Admin adminadminId) {
        this.adminadminId = adminadminId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partId != null ? partId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Partdesc)) {
            return false;
        }
        Partdesc other = (Partdesc) object;
        if ((this.partId == null && other.partId != null) || (this.partId != null && !this.partId.equals(other.partId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jcodetechnologies.beira.model.Partdesc[ partId=" + partId + " ]";
    }

}
