/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.model;


import java.io.Serializable;
import java.util.Map;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Lakshan Harischandra
 */
@Entity
@Table(name = "downtime")

public class Downtime implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "downtimeId")
    private Long downtimeId;
    @Size(max = 45)
    @Column(name = "startTime")
    private String fromDowntime;
    @Size(max = 45)
    @Column(name = "endTime")
    private String toDowntime;
    @Size(max = 45)
    @Column(name = "noOfMinutes")
    private String noOfMinutesDowntime;
    @Size(max = 45)
    @Column(name = "status")
    private String status;
    @Size(max = 45)
    @Column(name = "reason")
    private String reason;
    @Size(max = 800)
    @Column(name = "comment")
    private String comment;
    @JoinColumn(name = "MachineRunTime_machineTimeId", referencedColumnName = "machineTimeId")
    @ManyToOne(optional = false)
    private Machineruntime downtimeRuntimeId;

    public Downtime() {
    }

    public Downtime(Long downtimeId) {
        this.downtimeId = downtimeId;
    }
    
    public Downtime(Map<String, Object> map){
        this.fromDowntime=(String) map.get("from");
        this.toDowntime=(String) map.get("to");
        this.noOfMinutesDowntime=(String) map.get("mins");
        this.status=(String) map.get("status");
        this.reason=(String) map.get("reason");
        this.comment=(String) map.get("comment");
    }

    public Long getDowntimeId() {
        return downtimeId;
    }

    public void setDowntimeId(Long downtimeId) {
        this.downtimeId = downtimeId;
    }

    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getDowntimeId() != null ? getDowntimeId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Downtime)) {
            return false;
        }
        Downtime other = (Downtime) object;
        if ((this.getDowntimeId() == null && other.getDowntimeId() != null) || (this.getDowntimeId() != null && !this.downtimeId.equals(other.downtimeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jcodetechnologies.beira.model.Downtime[ downtimeId=" + getDowntimeId() + " ]";
    }

    /**
     * @return the fromDowntime
     */
    public String getFromDowntime() {
        return fromDowntime;
    }

    /**
     * @param fromDowntime the fromDowntime to set
     */
    public void setFromDowntime(String fromDowntime) {
        this.fromDowntime = fromDowntime;
    }

    /**
     * @return the toDowntime
     */
    public String getToDowntime() {
        return toDowntime;
    }

    /**
     * @param toDowntime the toDowntime to set
     */
    public void setToDowntime(String toDowntime) {
        this.toDowntime = toDowntime;
    }

    /**
     * @return the noOfMinutesDowntime
     */
    public String getNoOfMinutesDowntime() {
        return noOfMinutesDowntime;
    }

    /**
     * @param noOfMinutesDowntime the noOfMinutesDowntime to set
     */
    public void setNoOfMinutesDowntime(String noOfMinutesDowntime) {
        this.noOfMinutesDowntime = noOfMinutesDowntime;
    }

    /**
     * @return the downtimeRuntimeId
     */
    public Machineruntime getDowntimeRuntimeId() {
        return downtimeRuntimeId;
    }

    /**
     * @param downtimeRuntimeId the downtimeRuntimeId to set
     */
    public void setDowntimeRuntimeId(Machineruntime downtimeRuntimeId) {
        this.downtimeRuntimeId = downtimeRuntimeId;
    }
    
}
