/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.model;


import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
import javax.validation.constraints.Size;

/**
 *
 * @author Lakshan Harischandra
 */
@Entity
@Table(name = "productionitems")

public class Productionitems implements Serializable {

    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "itemId")
    private Long itemId;
    @Size(max = 55)
    @Column(name = "SO_number")
    private String sOnumber;
    @Size(max = 45)
    @Column(name = "customer")
    private String customer;
    @Size(max = 70)
    @Column(name = "partNumber")
    private String partNumber;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Size(max = 45)
    @Column(name = "producedQty")
    private String producedQty;
    @Column(name = "newCartons")
    private Integer newCartons;
    @Column(name = "usedCartons")
    private Integer usedCartons;
    @Column(name = "bags")
    private Integer bags;
    @Column(name = "die")
    @Basic(optional = false)
    private String die;
    @JoinColumn(name = "MachineRunTime_machineTimeId", referencedColumnName = "machineTimeId")
    @ManyToOne(optional = false)
    private Machineruntime machineRunTimemachineTimeId;
    @JoinColumn(name = "Production_productionId", referencedColumnName = "productionId")
    @ManyToOne(optional = false)
    private Production productionproductionId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productionItemsitemId")
    private List<Rejects> rejectsList;
    
    public Productionitems() {
    }

    public Productionitems(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

   
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    

    public Integer getNewCartons() {
        return newCartons;
    }

    public void setNewCartons(Integer newCartons) {
        this.newCartons = newCartons;
    }

    public Integer getUsedCartons() {
        return usedCartons;
    }

    public void setUsedCartons(Integer usedCartons) {
        this.usedCartons = usedCartons;
    }

    public Integer getBags() {
        return bags;
    }

    public void setBags(Integer bags) {
        this.bags = bags;
    }

    public Machineruntime getMachineRunTimemachineTimeId() {
        return machineRunTimemachineTimeId;
    }

    public void setMachineRunTimemachineTimeId(Machineruntime machineRunTimemachineTimeId) {
        this.machineRunTimemachineTimeId = machineRunTimemachineTimeId;
    }

    public Production getProductionproductionId() {
        return productionproductionId;
    }

    public void setProductionproductionId(Production productionproductionId) {
        this.productionproductionId = productionproductionId;
    }

    public List<Rejects> getRejectsList() {
        return rejectsList;
    }

    public void setRejectsList(List<Rejects> rejectsList) {
        this.rejectsList = rejectsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemId != null ? itemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productionitems)) {
            return false;
        }
        Productionitems other = (Productionitems) object;
        if ((this.itemId == null && other.itemId != null) || (this.itemId != null && !this.itemId.equals(other.itemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jcodetechnologies.beira.model.Productionitems[ itemId=" + itemId + " ]";
    }

    

    /**
     * @return the die
     */
    public String getDie() {
        return die;
    }

    /**
     * @param die the die to set
     */
    public void setDie(String die) {
        this.die = die;
    }

    /**
     * @return the sOnumber
     */
    public String getsOnumber() {
        return sOnumber;
    }

    /**
     * @param sOnumber the sOnumber to set
     */
    public void setsOnumber(String sOnumber) {
        this.sOnumber = sOnumber;
    }

    /**
     * @return the producedQty
     */
    public String getProducedQty() {
        return producedQty;
    }

    /**
     * @param producedQty the producedQty to set
     */
    public void setProducedQty(String producedQty) {
        this.producedQty = producedQty;
    }

    
    
}
