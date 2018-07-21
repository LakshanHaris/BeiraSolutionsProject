/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdeps.beira.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lakshan Harischandra
 */
public class ItemProductionDto implements Serializable {

    private BigInteger soNumber;
    private String customer;
    private String myInputProduction;
    private BigDecimal produced;
    private int cartonsNew;
    private int cartonsUsed;
    private int bags;
    private String die;
    private int metalDetector;
    private int backFlush;
    private int lineChange;
    private int lineRejects;
    private int other;
    private String runtimeFrom;
    private String runtimeTo;
    private String disabledInputRun;
    

    public ItemProductionDto() {
    }

    public BigInteger getSoNumber() {
        return soNumber;
    }

    /**
     * @param soNumber the soNumber to set
     */
    public void setSoNumber(BigInteger soNumber) {
        this.soNumber = soNumber;
    }

    /**
     * @return the customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * @return the myInputProduction
     */
    public String getMyInputProduction() {
        return myInputProduction;
    }

    /**
     * @param myInputProduction the myInputProduction to set
     */
    public void setMyInputProduction(String myInputProduction) {
        this.myInputProduction = myInputProduction;
    }

    /**
     * @return the produced
     */
    public BigDecimal getProduced() {
        return produced;
    }

    /**
     * @param produced the produced to set
     */
    public void setProduced(BigDecimal produced) {
        this.produced = produced;
    }

    /**
     * @return the cartonsNew
     */
    public int getCartonsNew() {
        return cartonsNew;
    }

    /**
     * @param cartonsNew the cartonsNew to set
     */
    public void setCartonsNew(int cartonsNew) {
        this.cartonsNew = cartonsNew;
    }

    /**
     * @return the cartonsUsed
     */
    public int getCartonsUsed() {
        return cartonsUsed;
    }

    /**
     * @param cartonsUsed the cartonsUsed to set
     */
    public void setCartonsUsed(int cartonsUsed) {
        this.cartonsUsed = cartonsUsed;
    }

    /**
     * @return the bags
     */
    public int getBags() {
        return bags;
    }

    /**
     * @param bags the bags to set
     */
    public void setBags(int bags) {
        this.bags = bags;
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
     * @return the metalDetector
     */
    public int getMetalDetector() {
        return metalDetector;
    }

    /**
     * @param metalDetector the metalDetector to set
     */
    public void setMetalDetector(int metalDetector) {
        this.metalDetector = metalDetector;
    }

    /**
     * @return the backFlush
     */
    public int getBackFlush() {
        return backFlush;
    }

    /**
     * @param backFlush the backFlush to set
     */
    public void setBackFlush(int backFlush) {
        this.backFlush = backFlush;
    }

    /**
     * @return the lineChange
     */
    public int getLineChange() {
        return lineChange;
    }

    /**
     * @param lineChange the lineChange to set
     */
    public void setLineChange(int lineChange) {
        this.lineChange = lineChange;
    }

    /**
     * @return the lineRejects
     */
    public int getLineRejects() {
        return lineRejects;
    }

    /**
     * @param lineRejects the lineRejects to set
     */
    public void setLineRejects(int lineRejects) {
        this.lineRejects = lineRejects;
    }

    /**
     * @return the other
     */
    public int getOther() {
        return other;
    }

    /**
     * @param other the other to set
     */
    public void setOther(int other) {
        this.other = other;
    }

    /**
     * @return the runtimeFrom
     */
    public String getRuntimeFrom() {
        return runtimeFrom;
    }

    /**
     * @param runtimeFrom the runtimeFrom to set
     */
    public void setRuntimeFrom(String runtimeFrom) {
        this.runtimeFrom = runtimeFrom;
    }

    /**
     * @return the runtimeTo
     */
    public String getRuntimeTo() {
        return runtimeTo;
    }

    /**
     * @param runtimeTo the runtimeTo to set
     */
    public void setRuntimeTo(String runtimeTo) {
        this.runtimeTo = runtimeTo;
    }

    /**
     * @return the disabledInputRun
     */
    public String getDisabledInputRun() {
        return disabledInputRun;
    }

    /**
     * @param disabledInputRun the disabledInputRun to set
     */
    public void setDisabledInputRun(String disabledInputRun) {
        this.disabledInputRun = disabledInputRun;
    }

    

}
