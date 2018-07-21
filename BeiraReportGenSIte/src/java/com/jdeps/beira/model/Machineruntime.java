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
@Table(name = "machineruntime")

public class Machineruntime implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "machineTimeId")
    private Long machineTimeId;
    @Size(max = 45)
    @Column(name = "startTime")
    private String fromRuntime;
    @Size(max = 45)
    @Column(name = "endTime")
    private String toRuntime;
    @Size(max = 70)
    @Column(name = "partNumber")
    private String partNumber;
    @Size(max = 45)
    @Column(name = "noOfMinutes")
    private String noOfMinutesRuntime;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "machineRunTimemachineTimeId")
    private List<Productionitems> productionitemsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "downtimeRuntimeId")
    private List<Downtime> downTimeList;

    public Machineruntime() {
    }

    public Machineruntime(Long machineTimeId) {
        this.machineTimeId = machineTimeId;
    }

    public Long getMachineTimeId() {
        return machineTimeId;
    }

    public void setMachineTimeId(Long machineTimeId) {
        this.machineTimeId = machineTimeId;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    
    /**
     * @return the fromRuntime
     */
    public String getFromRuntime() {
        return fromRuntime;
    }

    /**
     * @param fromRuntime the fromRuntime to set
     */
    public void setFromRuntime(String fromRuntime) {
        this.fromRuntime = fromRuntime;
    }

    /**
     * @return the toRuntime
     */
    public String getToRuntime() {
        return toRuntime;
    }

    /**
     * @param toRuntime the toRuntime to set
     */
    public void setToRuntime(String toRuntime) {
        this.toRuntime = toRuntime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (machineTimeId != null ? machineTimeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Machineruntime)) {
            return false;
        }
        Machineruntime other = (Machineruntime) object;
        if ((this.machineTimeId == null && other.machineTimeId != null) || (this.machineTimeId != null && !this.machineTimeId.equals(other.machineTimeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jcodetechnologies.beira.model.Machineruntime[ machineTimeId=" + machineTimeId + " ]";
    }

    /**
     * @return the productionitemsList
     */
    public List<Productionitems> getProductionitemsList() {
        return productionitemsList;
    }

    /**
     * @param productionitemsList the productionitemsList to set
     */
    public void setProductionitemsList(List<Productionitems> productionitemsList) {
        this.productionitemsList = productionitemsList;
    }

    
    /**
     * @return the noOfMinutesRuntime
     */
    public String getNoOfMinutesRuntime() {
        return noOfMinutesRuntime;
    }

    /**
     * @param noOfMinutesRuntime the noOfMinutesRuntime to set
     */
    public void setNoOfMinutesRuntime(String noOfMinutesRuntime) {
        this.noOfMinutesRuntime = noOfMinutesRuntime;
    }

    /**
     * @return the downTimeList
     */
    public List<Downtime> getDownTimeList() {
        return downTimeList;
    }

    /**
     * @param downTimeList the downTimeList to set
     */
    public void setDownTimeList(List<Downtime> downTimeList) {
        this.downTimeList = downTimeList;
    }

}
