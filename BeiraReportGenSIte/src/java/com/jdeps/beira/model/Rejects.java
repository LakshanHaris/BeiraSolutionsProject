/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.model;


import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Lakshan Harischandra
 */
@Entity
@Table(name = "rejects")

public class Rejects implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "rejectId")
    private Long rejectId;
    @Column(name = "metal_detector")
    private Integer metalDetector;
    @Column(name = "back_flush")
    private Integer backFlush;
    @Column(name = "line_change")
    private Integer lineChange;
    @Column(name = "line_rejects")
    private Integer lineRejects;
    @Column(name = "other")
    private Integer other;
    @JoinColumn(name = "ProductionItems_itemId", referencedColumnName = "itemId")
    @ManyToOne(optional = false)
    private Productionitems productionItemsitemId;

    public Rejects() {
    }

    public Rejects(Long rejectId) {
        this.rejectId = rejectId;
    }

    public Long getRejectId() {
        return rejectId;
    }

    public void setRejectId(Long rejectId) {
        this.rejectId = rejectId;
    }

    public Integer getMetalDetector() {
        return metalDetector;
    }

    public void setMetalDetector(Integer metalDetector) {
        this.metalDetector = metalDetector;
    }

    public Integer getBackFlush() {
        return backFlush;
    }

    public void setBackFlush(Integer backFlush) {
        this.backFlush = backFlush;
    }

    public Integer getLineChange() {
        return lineChange;
    }

    public void setLineChange(Integer lineChange) {
        this.lineChange = lineChange;
    }

    public Integer getLineRejects() {
        return lineRejects;
    }

    public void setLineRejects(Integer lineRejects) {
        this.lineRejects = lineRejects;
    }

    public Integer getOther() {
        return other;
    }

    public void setOther(Integer other) {
        this.other = other;
    }

    public Productionitems getProductionItemsitemId() {
        return productionItemsitemId;
    }

    public void setProductionItemsitemId(Productionitems productionItemsitemId) {
        this.productionItemsitemId = productionItemsitemId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rejectId != null ? rejectId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rejects)) {
            return false;
        }
        Rejects other = (Rejects) object;
        if ((this.rejectId == null && other.rejectId != null) || (this.rejectId != null && !this.rejectId.equals(other.rejectId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jcodetechnologies.beira.model.Rejects[ rejectId=" + rejectId + " ]";
    }
    
}
