/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.model;


import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author Lakshan Harischandra
 */
@Entity
@Table(name = "shift")

public class Shift implements Serializable {

   

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "shiftId")
    private Long shiftId;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Size(max = 5)
    @Column(name = "shift")
    private String shift;
    @Size(max = 45)
    @Column(name = "technician")
    private String technician;
    @Column(name = "numOfWorkers")
    private Integer numOfWorkers;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shiftshiftId")
    private List<Production> productionList;
    @JoinColumn(name = "Supervisor_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Supervisor supervisorid;

    public Shift() {
    }

    public Shift(Long shiftId) {
        this.shiftId = shiftId;
    }

    public Long getShiftId() {
        return shiftId;
    }

    public void setShiftId(Long shiftId) {
        this.shiftId = shiftId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }

    public Integer getNumOfWorkers() {
        return numOfWorkers;
    }

    public void setNumOfWorkers(Integer numOfWorkers) {
        this.numOfWorkers = numOfWorkers;
    }

    public List<Production> getProductionList() {
        return productionList;
    }

    public void setProductionList(List<Production> productionList) {
        this.productionList = productionList;
    }

    public Supervisor getSupervisorid() {
        return supervisorid;
    }

    public void setSupervisorid(Supervisor supervisorid) {
        this.supervisorid = supervisorid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shiftId != null ? shiftId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shift)) {
            return false;
        }
        Shift other = (Shift) object;
        if ((this.shiftId == null && other.shiftId != null) || (this.shiftId != null && !this.shiftId.equals(other.shiftId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jcodetechnologies.beira.model.Shift[ shiftId=" + shiftId + " ]";
    }

  
    
}
